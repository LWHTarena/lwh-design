package com.lwhtarena.design.decorator.coffeebar.coffee;

import com.lwhtarena.design.decorator.coffeebar.Drink;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:02
 * Description:
 */
public class Coffee extends Drink {

    /***********************
     * 纯咖啡的价格
     * @return
     ***********************/
    public float cost() {
        return super.getPrice();
    }
}
