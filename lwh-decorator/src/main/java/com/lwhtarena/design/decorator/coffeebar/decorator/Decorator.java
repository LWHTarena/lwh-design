package com.lwhtarena.design.decorator.coffeebar.decorator;

import com.lwhtarena.design.decorator.coffeebar.Drink;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:07
 * Description: 装饰者抽象类
 */
public class Decorator extends Drink {

    private Drink Obj;

    public Decorator(Drink obj) {
        Obj = obj;
    }

    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
    }

}
