package org.huangzi.frame.providers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProvidersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidersApplication.class, args);
    }

}
