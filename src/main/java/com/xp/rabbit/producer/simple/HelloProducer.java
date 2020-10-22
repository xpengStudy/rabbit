package com.xp.rabbit.producer.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloProducer {

    @Autowired
    private RabbitTemplate  rabbitTemplate;

    @Bean
    public Queue helloQueue(){
        return new Queue("hello-rabbit");
    }

    // 生产者发送消息
    public void sendMsg(String msg){
        rabbitTemplate.convertAndSend(msg);
    }

    @RequestMapping("/sendMsg")
    public  String  senddMsg(String msg){
        sendMsg(msg);
        return "success";
    }

}
