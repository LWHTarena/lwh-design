package com.lwhtarena.design.strategy.flybehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:17
 * Description: 飞的很差
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-------------飞的很差------------");
    }
}
