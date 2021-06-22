package com.learn.learndesignbastic.附录.继承.extend.service;

import com.learn.learndesignbastic.附录.继承.extend.father.Animal;
import com.learn.learndesignbastic.附录.继承.extend.inter.IChangeThing;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import sun.awt.EventQueueDelegate;

import java.awt.*;

/**
 * com.learn.learnthreadbastic.object_oriented.construction_method
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 10:07
 */
@Data
@Slf4j
public class OriginCat extends Animal{

    /**
     * 1. 子类继承父类，Animal cat = new OriginCat();先执行父类的构造方法，再执行子类的构造方法
     * 2.
     */
    public OriginCat() {
        super();
        log.info("cat()...");
    }

    public OriginCat(String name) {
        super(name);
        log.info("cat(name)...");
    }

    @Override
    public String shoutNum() {
        String result = "";
        for (int i = 0; i < shoutNum; i++) {
            result+=" miao ";
        }
        return "myname is "+name+"..."+result;
    }

}
