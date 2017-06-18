package com.lwhtarena.design.decorator.hotpot.decorator;

import com.lwhtarena.design.decorator.hotpot.GuoDi;
import com.lwhtarena.design.decorator.hotpot.PeiCai;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:12
 * Description: 麻辣牛肉
 */
public class MaLaNiuRou extends PeiCai {
    public MaLaNiuRou(GuoDi guodi) {
        super(guodi);
    }

    @Override
    public float cost() {
        return super.cost()+46f;
    }
    @Override
    public String name() {
        return super.name()+"+麻辣牛肉";
    }
}
