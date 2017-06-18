package com.lwhtarena.design.decorator.coffeebar.decorator;


import com.lwhtarena.design.decorator.coffeebar.Drink;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:10
 * Description:咖啡的佐料：巧克力
 */
public class Chocolate extends Decorator {

    /******************
     * 加巧克力的咖啡
     * @param obj
     ******************/
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
