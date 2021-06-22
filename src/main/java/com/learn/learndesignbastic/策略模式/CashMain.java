package com.learn.learndesignbastic.策略模式;

import com.learn.learndesignbastic.策略模式.factory.CashFactory;
import com.learn.learndesignbastic.策略模式.service.CashSuper;

/**
 * com.learn.learndesignbastic.策略模式
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 17:54
 */
public class CashMain {

    public static void main(String[] args) {
        CashFactory cashFactory = new CashFactory("打折");
        System.out.println("打折："+cashFactory.getResult(200));
    }
}
