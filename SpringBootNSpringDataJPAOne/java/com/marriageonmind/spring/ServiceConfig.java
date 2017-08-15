package com.marriageonmind.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.marriageonmind.service" })
public class ServiceConfig {
}
