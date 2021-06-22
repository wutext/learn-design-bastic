package com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod;

import com.learn.learndesignbastic.简单工厂模式.Calculator.operation.Operation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 15:37
 */
@Slf4j
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        log.info("加法运算...");
        return getOne()-getTwo();
    }
}
