package com.learn.learndesignbastic.附录.继承.origin;

import lombok.Data;

/**
 * com.learn.learnthreadbastic.object_oriented.construction_method
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 10:07
 */
@Data
public class OriginDog {

    private String name;
    private int shoutNum;

    public OriginDog() {
        this.name="wuming";
    }

    public OriginDog(String name) {
        this.name = name;
    }

    public String shout(){
        String result= "";
        for (int i = 0; i < shoutNum; i++) {
            result+=" wang ";
        }
        return "my name is "+name+result;
    }
}
