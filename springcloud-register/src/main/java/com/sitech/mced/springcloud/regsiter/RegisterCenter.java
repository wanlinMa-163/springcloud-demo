package com.sitech.mced.springcloud.regsiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mawl_mced
 * @date 2022/4/13 13:51
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenter {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenter.class, args);
    }
}
