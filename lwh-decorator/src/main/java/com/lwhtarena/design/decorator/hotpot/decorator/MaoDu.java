package com.lwhtarena.design.decorator.hotpot.decorator;

import com.lwhtarena.design.decorator.hotpot.GuoDi;
import com.lwhtarena.design.decorator.hotpot.PeiCai;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:13
 * Description: 毛肚
 */
public class MaoDu extends PeiCai {

    public MaoDu(GuoDi guodi) {
        super(guodi);
    }

    @Override
    public float cost() {
        return super.cost()+30f;
    }
    @Override
    public String name() {
        return super.name()+"+大刀毛肚";
    }
}
