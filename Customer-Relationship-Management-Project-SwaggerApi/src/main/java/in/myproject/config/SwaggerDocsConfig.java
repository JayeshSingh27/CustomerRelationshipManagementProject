package in.myproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig 
{
	@Bean
	public Docket createDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)  //UI Screen Type
		          .select()                             //To Specify Rest Controller     
		          .apis(RequestHandlerSelectors.basePackage("in.myproject.controller"))//Package in which controller is present       
		          .paths(PathSelectors.regex("/customer.*"))  //EndPoint                        
		          .build(); //Creates Docket Object   
	}
}
