package com.billcom.changelogicalresource.configuration;


import com.billcom.changelogicalresource.bean.Extern;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for Swagger API documentation.
 * Implements the WebMvcConfigurer interface to customize Spring Web MVC behavior.
 */
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

	/**
	 * Creates and returns a custom OpenAPI bean with the specified configurations.
	 *
	 * @return The custom OpenAPI bean.
	 */
	@Bean
	public OpenAPI customOpenAPI() {

		License mitLicense = new License().name(Extern.getSwaggerLicense() ).url(Extern.getSwaggerLicenseUrl() );
		// Set the information for the API
		Info info = new Info()
				// Add details such as title, description, version, etc.
				.title(Extern.getSwaggerTitle() )
				.description(Extern.getSwaggerDescription() )
				.license(mitLicense)
				.version(Extern.getSwaggerVersion() );
		// Set the information in the OpenAPI bean and Return the configured OpenAPI bean
		return new OpenAPI().info(info);
	}
	/**
	 * Adds view controllers for simple automated view controller mappings.
	 *
	 * @param registry The ViewControllerRegistry to register the view controllers.
	 */
	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/swagger-ui.html");
		registry.addRedirectViewController("/swagger-ui", "/swagger-ui.html");
	}

}
