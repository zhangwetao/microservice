/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.archer.lab.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@EnableEurekaClient
public class DoctorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoctorApplication.class);
    }
}
