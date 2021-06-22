package com.learn.learndesignbastic.附录.继承.extend.service;

import com.learn.learndesignbastic.附录.继承.extend.father.Animal;
import com.learn.learndesignbastic.附录.继承.extend.inter.IDoThing;
import lombok.Data;

/**
 * com.learn.learnthreadbastic.object_oriented.construction_method
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 10:07
 */
@Data
public class OriginDog extends Animal{

    public OriginDog() {
    }

    public OriginDog(String name) {
        super(name);
    }

    @Override
    public String shoutNum() {
        String result = "";
        for (int i = 0; i < shoutNum; i++) {
            result+=" wang ";
        }
        return "myname is "+name+"..."+result;
    }

}
