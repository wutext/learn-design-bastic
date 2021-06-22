package com.learn.learndesignbastic.代理模式;

import com.learn.learndesignbastic.代理模式.entity.SchoolGirls;
import com.learn.learndesignbastic.代理模式.service.impl.Proxy;

/**
 * com.learn.learndesignbastic.代理模式.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 15:45
 */
public class ProxyMain {

    public static void main(String[] args) {
        SchoolGirls girls = new SchoolGirls("jiaojiao");
        Proxy proxy = new Proxy(girls);
        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }

}
