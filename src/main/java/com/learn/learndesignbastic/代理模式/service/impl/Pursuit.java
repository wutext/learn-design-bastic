package com.learn.learndesignbastic.代理模式.service.impl;

import com.learn.learndesignbastic.代理模式.service.GiveGift;
import com.learn.learndesignbastic.代理模式.entity.SchoolGirls;

/**
 * com.learn.learndesignbastic.代理模式.service
 * 追求者类
 * @Author wujiyao
 * @create 2021 2021/6/22 15:40
 */
public class Pursuit implements GiveGift {

    private SchoolGirls girls;

    public Pursuit(SchoolGirls girls) {
        this.girls = girls;
    }

    @Override
    public void giveDolls() {
        System.out.println(girls.getName()+"...dools");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girls.getName()+"...flows");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girls.getName()+"...chocolate");
    }
}
