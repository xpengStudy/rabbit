package com.xp.thread;

public class Bank {

    public static void main(String[] args) {
        TestThread t1 = new TestThread("柜台一");
        t1.start();

        TestThread t2 = new TestThread("柜台二");
        t2.start();

        TestThread t3 = new TestThread("柜台三");
        t3.start();
    }
}
