package com.learn.learndesignbastic.装饰模式.decorator.service.impl;

import com.learn.learndesignbastic.装饰模式.decorator.service.Component;

/**
 * com.learn.learndesignbastic.装饰模式.decorator.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 11:05
 */
public class ConcreteComponentB extends Component {

    private final static String component = "原本的值";

    @Override
    public void operation(String decorator) {
        System.out.println("ConcreteComponentB..."+decorator);
    }
}
