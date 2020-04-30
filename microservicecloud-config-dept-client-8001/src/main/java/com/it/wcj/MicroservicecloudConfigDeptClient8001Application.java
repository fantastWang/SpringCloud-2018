package com.it.wcj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservicecloudConfigDeptClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigDeptClient8001Application.class, args);
    }
}
