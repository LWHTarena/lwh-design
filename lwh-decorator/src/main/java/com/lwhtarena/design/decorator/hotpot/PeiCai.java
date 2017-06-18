package com.lwhtarena.design.decorator.hotpot;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:10
 * Description: 定义装饰者抽象类
 */
public abstract class PeiCai implements GuoDi{
    private GuoDi guodi;

    public PeiCai(GuoDi guodi) {
        super();
        this.guodi = guodi;
    }
    @Override
    public float cost() {
        return guodi.cost();
    }
    @Override
    public String name() {
        return guodi.name();
    }
}
