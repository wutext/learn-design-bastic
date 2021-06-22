package com.learn.learndesignbastic.简单工厂模式.Calculator;

import com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod.OperationSub;
import com.learn.learndesignbastic.简单工厂模式.Calculator.operation.Operation;
import com.learn.learndesignbastic.简单工厂模式.Calculator.service.OperationService;

/**
 * com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 15:39
 */
public class OperationMain {

    public static void main(String[] args) {

        //创建简单工厂类来计算
        Operation operation = OperationService.getOperationResult("-");
        operation.setOne(10);
        operation.setTwo(3);
        double result = operation.getResult();
        System.out.println("计算结果: "+result);
        //基础类使用
     /*   OperationAdd add = new OperationAdd(1,4);
        double result = add.getResult();
        System.out.println("+结果："+result);
*/
       /* OperationSub sub = new OperationSub(1,4);
        double subResult = sub.getResult();
        System.out.println("-结果："+subResult);*/
    }
}
