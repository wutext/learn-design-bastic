package com.learn.learndesignbastic.建造者模式.demo;

/**
 * com.learn.learndesignbastic.建造者模式.demo
 *
 * @Author wujiyao
 * @create 2021 2021/7/15 9:50
 */
public class ConcreteBuilder extends Builder{
    @Override
    void builderA() {
        product.setPartA("具体实现者partA部件");
    }

    @Override
    void builderB() {
        product.setPartA("具体实现者partB部件");
    }

    @Override
    void builderC() {
        product.setPartA("具体实现者partC部件");
    }
}
