package com.borgesan.infra;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static Predicate<String> queryToolPaths() {
        return or(regex("/core.*"), regex("/log/.*"));
    }

    private static ApiInfo apiInfo() {
        Contact contact = new Contact("Study case", "https://confluence.es.ad.adp.com/pages/viewpage.action?pageId=499813153", "andre.borges@ADP.com");

        return new ApiInfoBuilder().title("Study case API")
                .description("Provide an API")
                .contact(contact)
                .version("1.0").build();
    }

    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2.SWAGGER_2)
                .pathMapping("/borgesan/")
                .apiInfo(apiInfo())
                .select().paths(queryToolPaths())
                .build().useDefaultResponseMessages(false);

    } */

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


}
