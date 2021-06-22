package com.learn.learndesignbastic.简单工厂模式.Calculator.service;

import com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod.OperationAdd;
import com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod.OperationSub;
import com.learn.learndesignbastic.简单工厂模式.Calculator.operation.Operation;
import lombok.Data;

/**
 * com.learn.learndesignbastic.简单工厂模式.Calculator.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 15:49
 */
public class OperationService {

    public static Operation getOperationResult(String type) {
        Operation operation;
        switch (type) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = null;
                break;
            case "/":
                operation = null;
                break;
            default:
                operation = new Operation() {
                    @Override
                    public double getResult() {
                        return 0;
                    }
                };
                break;
        }
        return operation;
    }
}
