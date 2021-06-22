package com.learn.learndesignbastic.装饰模式.decorator.service;

import org.springframework.stereotype.Service;

/**
 * com.learn.learndesignbastic.装饰模式.decorator
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 11:04
 */
@Service
public abstract class Component {

    public abstract void operation(String decorator);
}
