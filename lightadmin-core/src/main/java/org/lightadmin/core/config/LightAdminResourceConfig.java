package org.lightadmin.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMIN_CUSTOM_FRAGMENT_SERVLET_URL;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMIN_CUSTOM_RESOURCE_FRAGMENT_LOCATION;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO_CLASSPATH_LOCATION;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO_WEB_INF_LOCATION;

@Configuration
@EnableWebMvc
public class LightAdminResourceConfig implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        .addResourceHandler(LIGHT_ADMIN_CUSTOM_FRAGMENT_SERVLET_URL)
        .addResourceLocations(LIGHT_ADMIN_CUSTOM_RESOURCE_FRAGMENT_LOCATION);
    registry
        .addResourceHandler(LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO)
        .addResourceLocations(LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO_CLASSPATH_LOCATION,
            LIGHT_ADMIN_CUSTOM_RESOURCE_LOGO_WEB_INF_LOCATION);
  }
}
