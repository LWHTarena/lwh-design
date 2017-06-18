package com.lwhtarena.design.decorator.coffeebar;

import com.lwhtarena.design.decorator.coffeebar.coffee.Decaf;
import com.lwhtarena.design.decorator.coffeebar.coffee.LongBlack;
import com.lwhtarena.design.decorator.coffeebar.decorator.Chocolate;
import com.lwhtarena.design.decorator.coffeebar.decorator.Milk;
import com.lwhtarena.design.decorator.coffeebar.decorator.Soy;

/**
 * @Author: liwh
 * @Date: 2017/6/18 14:00
 * Description:
 */
public class CoffeeBar {

    public static void main(String[] args) {

        /*********************
         * 模拟下单：无咖啡因咖啡
         *********************/
        Drink order =new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println("****************");
        order=new LongBlack();
        order=new Milk(order); //加奶的咖啡
        order=new Soy(order); //加黄豆浆的咖啡
        order=new Chocolate(order); //加巧克力的咖啡
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}
