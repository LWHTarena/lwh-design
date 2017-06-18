package com.lwhtarena.design.strategy.flybehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:16
 * Description: 飞的很好
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("------------飞的很好-------------");
    }
}
