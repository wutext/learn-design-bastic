package com.learn.learndesignbastic.策略模式.service;

/**
 * com.learn.learndesignbastic.策略模式.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 17:43
 */
public class CashRebate extends CashSuper{

    private double moneyRebate = 0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        System.out.println("打折收费");
        return money * moneyRebate;
    }
}
