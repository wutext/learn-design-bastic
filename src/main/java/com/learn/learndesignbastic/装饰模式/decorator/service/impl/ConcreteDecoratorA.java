package com.learn.learndesignbastic.装饰模式.decorator.service.impl;

import com.learn.learndesignbastic.装饰模式.decorator.service.Decorator;

/**
 * com.learn.learndesignbastic.装饰模式.decorator.service.impl
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 11:16
 */
public class ConcreteDecoratorA extends Decorator {

    public void operation(String decorator) {
        super.operation(decorator);
        System.out.println("具体装饰这A.."+decorator);
    }

}
