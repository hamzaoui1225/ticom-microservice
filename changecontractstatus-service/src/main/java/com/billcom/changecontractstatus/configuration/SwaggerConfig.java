package com.billcom.changecontractstatus.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

	@Value("${swagger.title}")
	String getSwaggerTitle;
	@Value("${swagger.version}")
	String getSwaggerVersion;
	@Value("${swagger.license}")
	String getSwaggerLicense;
	@Value("${swagger.licenseurl}")
	String getSwaggerLicenseUrl;
	@Value("${swagger.description}")
	String getSwaggerDescription;
	@Value("${spring.application.name}")
	String getMicroServiceName;
	@Bean
	public OpenAPI customOpenAPI() {
		License mitLicense = new License().name(getSwaggerLicense).url(getSwaggerLicenseUrl);
		Info info = new Info()
				.title(getMicroServiceName)
				.description(getSwaggerDescription)
				.license(mitLicense)
				.version(getSwaggerVersion);
		return new OpenAPI().info(info);
	}
	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/swagger-ui.html");
		registry.addRedirectViewController("/swagger-ui", "/swagger-ui.html");
	}

}
