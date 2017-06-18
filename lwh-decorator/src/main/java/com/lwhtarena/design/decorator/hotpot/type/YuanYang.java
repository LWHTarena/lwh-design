package com.lwhtarena.design.decorator.hotpot.type;

import com.lwhtarena.design.decorator.hotpot.GuoDi;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:05
 * Description: 锅底种类：鸳鸯锅底 48￥
 * 定义具体被装饰对象（也就是各种锅底，这里定义两种）
 */
public class YuanYang implements GuoDi {

    public float cost() {
        return 48.0f;
    }

    public String name() {
        return "鸳鸯锅底";
    }
}
