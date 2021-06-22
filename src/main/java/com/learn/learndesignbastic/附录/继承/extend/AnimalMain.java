package com.learn.learndesignbastic.附录.继承.extend;

import com.learn.learndesignbastic.附录.继承.extend.father.Animal;
import com.learn.learndesignbastic.附录.继承.extend.service.*;
import com.learn.learndesignbastic.附录.继承.extend.specific.HomeCat;
import com.learn.learndesignbastic.附录.继承.extend.specific.MachineCat;
import com.learn.learndesignbastic.附录.继承.extend.specific.SunWuKongDog;
import lombok.extern.slf4j.Slf4j;

/**
 * com.learn.learnthreadbastic.object_oriented.extend_father.extend
 *
 * @Author wujiyao
 * @create 2021 2021/6/1 15:42
 */
@Slf4j
public class AnimalMain {

    private static Animal[] animals = new Animal[5];

    public static void main(String[] args) {

        //子类继承父类调用的方法
//        AnimalMain.duoTai();
//
//        //开始游戏：每个动物不同的叫声
//        AnimalMain.animalBeginGame();

        /**
         * 继承父类，实现做事情的接口
         * 思想: 1. cat和Dog都属于动物,具有很多相同的属性和行为,所以需要抽象出一个动物父类
         *      2. cat有不同的猫(机器猫(MachineCat),家猫(HomeCat),...), 所以可以做不同的事情;
         *         不同的事情可以定义为接口, 通过接口来实现做不同的事情,MachineCat,HomeCat继承Cat猫类
         *      3. 其他动物需要有区分, 实现类MachineCat和SunWuKongDog属于不同的动物，所以分别继承Cat和Dog
         */
        MachineCat cat = new MachineCat("叮当");
        HomeCat homeCat = new HomeCat("家猫");
        SunWuKongDog dog = new SunWuKongDog("sunwukong");
        cat.changeThing();
        System.out.println(cat.shoutNum());
        homeCat.doThing();
        System.out.println(homeCat.shoutNum());
        dog.doThing();
        System.out.println(dog.shoutNum());
    }

    /**
     * 实现子类继承父类：调用子类方法前会先调用父类的构造方法
     */
    public static void duoTai() {
        Animal cat = new OriginCat();
        String catResult = cat.shoutNum();
        System.out.println(catResult);

        Animal dog = new OriginDog();
        String dogResult = dog.shoutNum();
        System.out.println(dogResult);

    }

    public static void animalBeginGame() {
        AnimalMain.getAnimalSignUp();
        for (Animal animal : animals) {
            String result = animal.shoutNum();
            System.out.println(result);
        }
    }

    public static void getAnimalSignUp() {
        animals[0] = new OriginCat("the cat");
        animals[1] = new OriginDog("the dog");
        animals[2] = new OriginCattle("the cattle");
        animals[3] = new OriginRabbit("the rabbit");
        animals[4] = new OriginWolf("the wolf");
    }
}
