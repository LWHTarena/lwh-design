package com.lwhtarena.design.strategy.quackbehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:22
 * Description:
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-------------嘎嘎叫------------");
    }
}
