package com.learn.learndesignbastic.观察者模式.demo;

import com.learn.learndesignbastic.观察者模式.example.Observer;

/**
 * com.learn.learndesignbastic.观察者模式.demo
 * 具体对象
 * @Author wujiyao
 * @create 2021 2021/7/15 11:00
 */
public class StockServerImpl extends Observer {

    public StockServerImpl(String name, SecretaryServiceImpl secretary) {
       super(name, secretary);
    }

    public void update() {
        System.out.println(secretary.getAction()+"   "+name+" close the gupiao web");
    }
}
