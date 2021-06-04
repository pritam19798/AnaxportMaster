package com.Anaxport.Master.SwaggerConfiguration;




import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {





	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	      .apiInfo(apiInfo())
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.Anaxport"))
	      .paths(PathSelectors.any())
	      .build();
	}
	
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Master Module.",
	      "Documentation of REST API.",
	      "1.0.0",
	      "Terms of service",
	      new Contact("Anaxport", "www.Anaxport.com", "Anaxport@Anaxport.com"),
	      "MIT License",
	      "https://opensource.org/licenses/MIT",
	      Collections.emptyList());
	}
}


