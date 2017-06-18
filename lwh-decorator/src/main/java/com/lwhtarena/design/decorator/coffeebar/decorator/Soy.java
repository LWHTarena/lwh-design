package com.lwhtarena.design.decorator.coffeebar.decorator;

import com.lwhtarena.design.decorator.coffeebar.Drink;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:09
 * Description: 咖啡的佐料：黄豆
 */
public class Soy extends Decorator {

    /******************
     * 加黄豆的咖啡
     * @param obj
     ******************/
    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
