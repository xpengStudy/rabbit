package com.xp.rabbit.local;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*****
 *  本地 rabbitMQ 的生产者
 */
public class LocalProduer {

    // 定义 QUEUE
    private static final String  QUEUE_NAME = "HelloQueue";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory  factory =  new ConnectionFactory();
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("/");

        Connection conn = factory.newConnection();
        Channel channel = conn.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        String  msg  = "hello xp!";
        channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());
        System.out.println("【"+msg+"】");
        channel.close();
        conn.close();


    }




}
