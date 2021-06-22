package com.learn.learndesignbastic.附录.继承.extend.service;

import com.learn.learndesignbastic.附录.继承.extend.father.Animal;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * com.learn.learnthreadbastic.object_oriented.construction_method
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 10:07
 */
@Data
@Slf4j
public class OriginRabbit extends Animal {

    /**
     * 1. 子类继承父类，Animal cat = new OriginCat();先执行父类的构造方法，再执行子类的构造方法
     * 2.
     */
    public OriginRabbit() {
        super();
        log.info("cat()...");
    }

    public OriginRabbit(String name) {
        super(name);
        log.info("cat(name)...");
    }

    @Override
    public String shoutNum() {
        String result = "";
        for (int i = 0; i < shoutNum; i++) {
            result+=" 兔兔兔 ";
        }
        return "myname is "+name+"..."+result;
    }
}
