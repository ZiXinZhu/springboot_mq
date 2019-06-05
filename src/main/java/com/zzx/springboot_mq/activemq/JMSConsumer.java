package com.zzx.springboot_mq.activemq;


import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JMSConsumer {

    /**
     * 就收QueueOne消息queue
     * @param mes
     */
    @JmsListener(destination = "QueueOne", containerFactory = "jmsListenerContainerQueue")
    public void resive(String mes){
        log.info("收到消息{},完成！",mes);
    }

    /**
     * 接收TopicOne消息topic
     * @param mes
     */
    @JmsListener(destination = "TopicOne", containerFactory = "jmsListenerContainerTopic")
    public void resivetopic(String mes){
        log.info("收到消息{},完成！",mes);
    }

}
