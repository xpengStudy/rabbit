package com.xp.thread;

public class TestThread extends Thread{

    private static  int Max = 100;

    private static  int index = 1;

    private String  name ;

    public TestThread(String name){
        this.name = name;
    }


    @Override
    public void run() {

        while (index<=Max){
            System.out.println("当前柜台为："+name+"，当前的号码为："+index++);
        }

    }
}
