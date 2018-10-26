package com.niezhiliang.servers.service.B;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2018/10/23 上午11:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ApplicationB {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationB.class);
    }
}