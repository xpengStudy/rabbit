package com.xp.rabbit.comsumer.simple;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloServer {

    @RabbitListener(queues = "hello-rabbit")
    public void receive1(String msg){
        System.out.println("hello:"+msg);
    }

}
