package com.learn.learndesignbastic.策略模式.service;

/**
 * com.learn.learndesignbastic.策略模式.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 17:43
 */
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        System.out.println("正常收取费用");
        return money;
    }
}
