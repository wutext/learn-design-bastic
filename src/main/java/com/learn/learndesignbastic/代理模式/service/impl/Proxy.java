package com.learn.learndesignbastic.代理模式.service.impl;

import com.learn.learndesignbastic.代理模式.service.GiveGift;
import com.learn.learndesignbastic.代理模式.entity.SchoolGirls;

/**
 * com.learn.learndesignbastic.代理模式.service
 * 代理类：代理别人做事情
 * @Author wujiyao
 * @create 2021 2021/6/22 15:38
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirls girls) {
        this.pursuit = new Pursuit(girls);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
