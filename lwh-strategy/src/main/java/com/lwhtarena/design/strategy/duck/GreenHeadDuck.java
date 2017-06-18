package com.lwhtarena.design.strategy.duck;

import com.lwhtarena.design.strategy.flybehavior.GoodFlyBehavior;
import com.lwhtarena.design.strategy.quackbehavior.GaGaQuackBehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:31
 * Description:
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void dispaly() {
        System.out.println("+++++++++++青头鸭++++++++++");
    }
}
