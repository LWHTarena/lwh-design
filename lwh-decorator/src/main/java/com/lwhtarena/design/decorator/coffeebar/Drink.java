package com.lwhtarena.design.decorator.coffeebar;

/**
 * @Author: liwh
 * @Date: 2017/6/18 13:59
 * Description: 超类
 */
public abstract class Drink {

    public String description = "";
    private float price = 0f;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
