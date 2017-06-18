package com.lwhtarena.design.decorator.coffeebar.decorator;

import com.lwhtarena.design.decorator.coffeebar.Drink;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:08
 * Description: 咖啡的佐料：牛奶
 */
public class Milk extends Decorator {

    /******************
     * 加黄豆的咖啡
     * @param obj
     ******************/
    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
