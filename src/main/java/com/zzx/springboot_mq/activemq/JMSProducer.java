package com.zzx.springboot_mq.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSProducer {
    @Autowired
    private JmsMessagingTemplate jmsTemplate;


    /**
     *   PTP
     * @param queueName
     * @param message
     */
    public void send(String queueName, String message) {
        this.jmsTemplate.convertAndSend(new ActiveMQQueue(queueName), message);
    }

    /**
     *  Topic
     * @param queueName
     * @param message
     */
    public void sendtopic(String queueName, String message) {
        this.jmsTemplate.convertAndSend(new ActiveMQTopic(queueName), message);
    }


}

