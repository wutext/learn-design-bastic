package com.learn.learndesignbastic.工厂模式.demo.service.impl;

import com.learn.learndesignbastic.工厂模式.demo.method.OperationAdd;
import com.learn.learndesignbastic.工厂模式.demo.operation.SimpleOperation;
import com.learn.learndesignbastic.工厂模式.demo.service.IFactoryOperation;

/**
 * com.learn.learndesignbastic.工厂模式.demo.service
 *
 * @Author wujiyao
 * @create 2021 2021/7/13 15:30
 */
public class FactoryOperationAddImpl implements IFactoryOperation {

    @Override
    public SimpleOperation getOperation() {
        return new OperationAdd();
    }
}
