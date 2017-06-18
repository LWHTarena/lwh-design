package com.lwhtarena.design.strategy;

import com.lwhtarena.design.strategy.duck.Duck;
import com.lwhtarena.design.strategy.duck.GreenHeadDuck;
import com.lwhtarena.design.strategy.duck.RedHeadDuck;
import com.lwhtarena.design.strategy.flybehavior.NoFlyBehavior;
import com.lwhtarena.design.strategy.quackbehavior.NoQuackBehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 11:22
 * Description:
 */
public class StimulateDuck {
    public static void main(String[] args) {

        Duck greenHeadDuck =new GreenHeadDuck();
        Duck redHeadDuck =new RedHeadDuck();

        greenHeadDuck.dispaly();
        greenHeadDuck.fly();
        greenHeadDuck.Quack();
        greenHeadDuck.swim();

        redHeadDuck.dispaly();
        redHeadDuck.fly();
        redHeadDuck.Quack();
        redHeadDuck.swim();

        redHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
        redHeadDuck.fly();
        redHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
        redHeadDuck.Quack();


    }
}
