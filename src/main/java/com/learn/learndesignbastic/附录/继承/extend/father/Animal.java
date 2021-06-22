package com.learn.learndesignbastic.附录.继承.extend.father;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.learn.learnthreadbastic.object_oriented.extend_father
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 11:29
 */
@Data
@Slf4j
public abstract class Animal {

    protected String name;
    protected int shoutNum;

    public Animal() {
        log.info("父类Animal()...");
        this.name="wuming";
    }

    public Animal(String name) {
        log.info("父类Animal(name)...");
        this.name = name;
    }

    public abstract String shoutNum();

}
