package com.lwhtarena.design.strategy.quackbehavior;

/**
 * @Author: liwh
 * @Date: 2017/6/17 10:21
 * Description:
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("--------------不会叫--------------");
    }
}
