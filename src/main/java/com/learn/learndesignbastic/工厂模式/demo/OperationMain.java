package com.learn.learndesignbastic.工厂模式.demo;

import com.learn.learndesignbastic.工厂模式.demo.operation.SimpleOperation;
import com.learn.learndesignbastic.工厂模式.demo.service.IFactoryOperation;
import com.learn.learndesignbastic.工厂模式.demo.service.impl.FactoryOperationAddImpl;

/**
 * com.learn.learndesignbastic.工厂模式.demo
 *
 * @Author wujiyao
 * @create 2021 2021/7/13 15:35
 */
public class OperationMain {

    public static void main(String[] args) {
        IFactoryOperation factoryOperationAdd = new FactoryOperationAddImpl();
        SimpleOperation operation = factoryOperationAdd.getOperation();
        operation.setOne(3);
        operation.setTwo(5);
        System.out.println("result： "+operation.getResult());
    }
}
