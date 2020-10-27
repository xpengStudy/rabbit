package com.xp.hx02;

import com.xp.hxdemo.Emp;

import java.math.BigDecimal;
import java.util.Date;

public class Fgz {

    public static void main(String[] args) {
        Emp zs = new Emp("张三", BigDecimal.valueOf(9397.32),"",new Date());
        Emp ls = new Emp("李三", BigDecimal.valueOf(5397.32),"",new Date());

        Double jj =  new Double(10000.00);

        System.out.println(zs.toString());
        System.out.println(ls.toString());

    }
}
