package com.lwhtarena.design.strategy.flybehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:13
 * Description: 不会飞
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("------------不会飞---------------");
    }
}
