package com.lwhtarena.design.decorator.coffeebar.coffee;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:03
 * Description:
 */
public class Decaf extends Coffee {

    /*************
     *无咖啡因的价格
     *************/
    public Decaf() {
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
