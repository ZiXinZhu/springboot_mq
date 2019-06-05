package com.zzx.springboot_mq.activemq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoEveryting {

    @Autowired
    private JMSProducer mqProducer;

    @GetMapping("/domq")
    public void doJms() {
        mqProducer.send("QueueOne", "来自one");
    }

    @GetMapping("/dotopic")
    public void doJmstopic() {
        mqProducer.sendtopic("TopicOne", "来自TopicOne");
    }

}
