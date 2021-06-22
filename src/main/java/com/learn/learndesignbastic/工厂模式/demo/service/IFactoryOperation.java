package com.learn.learndesignbastic.工厂模式.demo.service;

import com.learn.learndesignbastic.工厂模式.demo.operation.SimpleOperation;

/**
 * com.learn.learndesignbastic.工厂模式.demo.service
 *
 * @Author wujiyao
 * @create 2021 2021/7/13 15:29
 */
public interface IFactoryOperation {

    SimpleOperation getOperation();
}
