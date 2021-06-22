package com.learn.learndesignbastic.装饰模式.decorator.service;

import com.learn.learndesignbastic.装饰模式.decorator.service.impl.ConcreteComponentB;
import com.learn.learndesignbastic.装饰模式.decorator.service.impl.ConcreteDecoratorA;
import com.learn.learndesignbastic.装饰模式.decorator.service.impl.ConcreteDecoratorB;

/**
 * com.learn.learndesignbastic.装饰模式.decorator.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 11:19
 */
public class DecoratorMain {

    public static void main(String[] args) {

        ConcreteComponentB componentB = new ConcreteComponentB();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 =  new ConcreteDecoratorB();
        d1.setComponent(componentB);
        d2.setComponent(d1);
        d2.operation("ad");
    }
}
