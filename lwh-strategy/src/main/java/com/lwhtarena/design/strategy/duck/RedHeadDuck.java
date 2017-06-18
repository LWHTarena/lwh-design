package com.lwhtarena.design.strategy.duck;

import com.lwhtarena.design.strategy.flybehavior.BadFlyBehavior;
import com.lwhtarena.design.strategy.quackbehavior.GeGeQuackBehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 11:19
 * Description:
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void dispaly() {
        System.out.println("***********红头鸭**");
    }
}
