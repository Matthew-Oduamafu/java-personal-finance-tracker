//package io.nerdbyteslns.personalfinancetracker.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket apiDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("io.nerdbyteslns.personalfinancetracker"))
//                .build()
//                .protocols(new HashSet<>(List.of("https"))); // Set the protocol to HTTPS
//    }
//}
