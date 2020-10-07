package com.company.restapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2UiConfiguration {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.company")).build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfo("Demo Service",
				"All end points and documentation related to rest app services", "1.0", "Terms of service",
				new Contact("Company Name", "Enter the company URL", "anyone@company.com"), "Company Version 2.0",
				"https://company.com/license");
	}

}
