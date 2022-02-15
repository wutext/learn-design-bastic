package com.learn.learndesignbastic.观察者模式.demo;

import com.learn.learndesignbastic.观察者模式.example.Observer;

/**
 * com.learn.learndesignbastic.观察者模式.demo
 *
 * @Author wujiyao
 * @create 2021 2021/7/15 11:00
 */
public class StockServer extends Observer {

    private String name;
    private Secretary secretary;

    public StockServer(String name, Secretary secretary) {
       super(name, secretary);
    }

    public void update() {

        System.out.println(secretary.getAction()+"   "+name+" sdsadfsdfdsasaf");
    }
}
