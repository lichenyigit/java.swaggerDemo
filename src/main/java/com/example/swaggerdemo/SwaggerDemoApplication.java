package com.example.swaggerdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(
        title = "zhaowenzhe",
        version = "1.0",
        description = "aaa",
        termsOfService = "http://www.zhaowenzhe.com"
))
public class SwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemoApplication.class, args);
    }

}
