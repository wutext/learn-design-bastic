package com.learn.learndesignbastic.工厂模式.demo.service.impl;

import com.learn.learndesignbastic.工厂模式.demo.method.OperationAdd;
import com.learn.learndesignbastic.工厂模式.demo.method.OperationSub;
import com.learn.learndesignbastic.工厂模式.demo.operation.SimpleOperation;
import com.learn.learndesignbastic.工厂模式.demo.service.IFactoryOperation;
import com.learn.learndesignbastic.简单工厂模式.Calculator.operation.Operation;

/**
 * com.learn.learndesignbastic.工厂模式.demo.service
 *
 * @Author wujiyao
 * @create 2021 2021/7/13 15:30
 */
public class FactoryOperationSubImpl implements IFactoryOperation {

    @Override
    public SimpleOperation getOperation() {
        return new OperationSub();
    }
}
