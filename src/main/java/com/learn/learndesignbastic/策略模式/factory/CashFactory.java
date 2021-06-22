package com.learn.learndesignbastic.策略模式.factory;

import com.learn.learndesignbastic.策略模式.service.CashNormal;
import com.learn.learndesignbastic.策略模式.service.CashRebate;
import com.learn.learndesignbastic.策略模式.service.CashReturn;
import com.learn.learndesignbastic.策略模式.service.CashSuper;

/**
 * com.learn.learndesignbastic.策略模式.factory
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 17:50
 */
public class CashFactory {

    public static CashSuper cashSuper;

    public CashFactory(String type) {

        switch (type) {
            case "正常":
                cashSuper = new CashNormal();
                break;
            case "打折":
                cashSuper = new CashRebate(0.5);
                break;
            case "满减":
                cashSuper = new CashReturn(500, 300);
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
