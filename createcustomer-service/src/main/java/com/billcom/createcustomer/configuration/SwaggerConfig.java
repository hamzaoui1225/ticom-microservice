package com.billcom.createcustomer.configuration;

import com.billcom.createcustomer.bean.Extern;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

@Bean
public OpenAPI customOpenAPI() {

	License mitLicense = new License().name( Extern.getSwaggerLicense()).url(Extern.getSwaggerLicenseUrl());

			Info info = new Info()
					.title(Extern.getSwaggerTitle())
					.description(Extern.getSwaggerDescription())
					.license(mitLicense)
					.version(Extern.getSwaggerVersion());
	               return new OpenAPI().info(info);
}
	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/swagger-ui.html");
		registry.addRedirectViewController("/swagger-ui", "/swagger-ui.html");
	}

}
