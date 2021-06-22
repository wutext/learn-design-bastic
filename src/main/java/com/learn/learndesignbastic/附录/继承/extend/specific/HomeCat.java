package com.learn.learndesignbastic.附录.继承.extend.specific;

import com.learn.learndesignbastic.附录.继承.extend.inter.IChangeThing;
import com.learn.learndesignbastic.附录.继承.extend.inter.IDoThing;
import com.learn.learndesignbastic.附录.继承.extend.service.OriginCat;

/**
 * com.learn.learndesignbastic.附录.继承.extend.specific
 * 具体的动物类
 * @Author wujiyao
 * @create 2021 2021/6/9 11:09
 */
public class HomeCat extends OriginCat implements IDoThing {

    public HomeCat() {
    }

    public HomeCat(String name) {
        super(name);
    }

    @Override
    public String doThing() {
        System.out.println("家猫...");
        return name;
    }


}
