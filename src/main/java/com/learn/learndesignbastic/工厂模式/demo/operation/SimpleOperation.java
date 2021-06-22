package com.learn.learndesignbastic.工厂模式.demo.operation;

import lombok.Data;

/**
 * com.learn.learndesignbastic.简单工厂模式.Calculator.operation
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 15:39
 */
@Data
public abstract class SimpleOperation {

    private double one;
    private double two;

    public SimpleOperation() {
    }

    public SimpleOperation(double one, double two) {
        this.one = one;
        this.two = two;
    }

    public abstract double getResult();

}
