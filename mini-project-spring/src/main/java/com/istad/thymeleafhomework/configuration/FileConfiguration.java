package com.istad.thymeleafhomework.configuration;

import lombok.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class FileConfiguration implements WebMvcConfigurer {
    String serverPath = "src/main/resources/images/";
    String clientPath = "/images/**";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(clientPath).addResourceLocations("file:" + serverPath);
    }
}
