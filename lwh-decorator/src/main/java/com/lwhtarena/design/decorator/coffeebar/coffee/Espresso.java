package com.lwhtarena.design.decorator.coffeebar.coffee;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:04
 * Description:
 */
public class Espresso extends Coffee {

    /*****************
     * 浓咖啡 的价格
     ****************/
    public Espresso() {
        super.setDescription("Espresso");
        super.setPrice(4.0f);
    }
}
