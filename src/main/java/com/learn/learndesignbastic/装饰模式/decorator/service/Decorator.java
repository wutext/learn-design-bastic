package com.learn.learndesignbastic.装饰模式.decorator.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * com.learn.learndesignbastic.装饰模式.decorator.service
 *
 * @Author wujiyao
 * @create 2021 2021/6/22 11:11
 */
@Service
public abstract class Decorator extends Component{

    protected Component component;

    private final static String decorator = "decorator";

    public void setComponent(Component component) {
        this.component = component;
    }

    public void operation(String decorator) {
        if(component!=null) {
            component.operation(decorator);
        }
    }

}
