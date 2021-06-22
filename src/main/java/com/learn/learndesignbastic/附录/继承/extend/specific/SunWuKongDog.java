package com.learn.learndesignbastic.附录.继承.extend.specific;

import com.learn.learndesignbastic.附录.继承.extend.inter.IDoThing;
import com.learn.learndesignbastic.附录.继承.extend.service.OriginDog;

/**
 * com.learn.learndesignbastic.附录.继承.extend.specific
 * 具体的动物类
 * @Author wujiyao
 * @create 2021 2021/6/9 11:11
 */
public class SunWuKongDog extends OriginDog implements IDoThing {

    public SunWuKongDog() {
    }

    public SunWuKongDog(String name) {
        super(name);
    }

    @Override
    public String doThing() {
        System.out.println("sunwukong Dog");
        return "sunwukong Dog jindouyun";
    }
}
