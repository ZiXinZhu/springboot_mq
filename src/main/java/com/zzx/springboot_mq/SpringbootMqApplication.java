package com.zzx.springboot_mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringbootMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMqApplication.class, args);
    }

}
