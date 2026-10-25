package com.rishi.electrohub.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;


@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "ElectroHub Development Team",
						email = "iamrishiraz@gmail.com",
						url = "https://github.com/iamrishiraz"
				),
				title = "ElectroHub API",
				description = "REST API for managing electronic products, categories, users, carts, orders, and authentication.",
				version = "1.0.0"
		),
		security = @SecurityRequirement(name = "JWT Authentication")
)
@SecurityScheme(
		name = "JWT Authentication",
		description = "Enter the JWT token obtained after login.",
		type = SecuritySchemeType.HTTP,
		scheme = "bearer",
		bearerFormat = "JWT",
		in = SecuritySchemeIn.HEADER
)
@Configuration
public class SwaggerOpenApiConfig {

	public SwaggerOpenApiConfig(
			MappingJackson2HttpMessageConverter converter) {
		var supportedMediaTypes =
				new ArrayList<>(converter.getSupportedMediaTypes());

		supportedMediaTypes.add(
				new MediaType("application", "octet-stream"));

		converter.setSupportedMediaTypes(supportedMediaTypes);
	}
}
