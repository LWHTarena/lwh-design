package com.lwhtarena.design.strategy.duck;

import com.lwhtarena.design.strategy.flybehavior.FlyBehavior;
import com.lwhtarena.design.strategy.quackbehavior.QuackBehavior;

/**
 * Created by Administrator on 2017/6/17.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /****************
     * 飞行为
     ****************/
    public void  fly(){
        flyBehavior.fly();
    }

    /***************
     * 叫行为
     ***************/
    public void Quack(){
        quackBehavior.quack();
    }

    /***************
     * 展现 抽象方法
     ***************/
    public abstract void dispaly();

    /*************************
     * 设置2个行为，动态改变行为
     *************************/
    public void SetQuackBehavoir(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void SetFlyBehavoir(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void swim() {
        System.out.println("~~im swim~~");
    }

}
