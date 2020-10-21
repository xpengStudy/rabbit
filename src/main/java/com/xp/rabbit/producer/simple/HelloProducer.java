package com.xp.rabbit.producer.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class HelloProducer {

    @Autowired
    private RabbitTemplate  rabbitTemplate;

    @Bean
    public Queue helloQueue(){
        return new Queue("hello-rabbit");
    }

    public void sendMsg(String msg){
        rabbitTemplate.convertAndSend(msg);
    }

}
