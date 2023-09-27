package com.app.trackmediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrackmeDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackmeDiscoveryApplication.class, args);
    }

}
