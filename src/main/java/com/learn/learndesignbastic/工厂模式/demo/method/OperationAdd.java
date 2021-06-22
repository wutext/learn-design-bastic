package com.learn.learndesignbastic.工厂模式.demo.method;

import com.learn.learndesignbastic.工厂模式.demo.operation.SimpleOperation;
import com.learn.learndesignbastic.简单工厂模式.Calculator.operation.Operation;
import lombok.extern.slf4j.Slf4j;

/**
 * com.learn.learndesignbastic.简单工厂模式.Calculator.calcuratorMethod
 *
 * @Author wujiyao
 * @create 2021 2021/6/9 15:37
 */
@Slf4j
public class OperationAdd extends SimpleOperation {

    @Override
    public double getResult() {
        log.info("加法运算...");
        return getOne()-getTwo();
    }
}
