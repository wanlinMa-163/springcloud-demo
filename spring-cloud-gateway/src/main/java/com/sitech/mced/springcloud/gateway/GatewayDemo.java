package com.sitech.mced.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mawl_mced
 * @date 2022/4/13 13:45
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayDemo {
    public static void main(String[] args) {

        SpringApplication.run(GatewayDemo.class, args);

    }
}
