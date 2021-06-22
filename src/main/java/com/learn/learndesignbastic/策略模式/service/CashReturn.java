package com.learn.learndesignbastic.策略模式.service;

/**
 * com.learn.learndesignbastic.策略模式.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 17:43
 */
public class CashReturn extends CashSuper{

    //满额度
    private double moneyCondition;
    //返额
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        System.out.println("满额返...");
        if(money > moneyCondition) {
            money = money - (money/moneyCondition) * moneyReturn;
        }
        return money;
    }
}
