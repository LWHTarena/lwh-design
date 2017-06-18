package com.lwhtarena.design.decorator.hotpot.type;

import com.lwhtarena.design.decorator.hotpot.GuoDi;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:07
 * Description: 锅底种类：大龙燚火锅原味锅底 59￥
 * 定义具体被装饰对象（也就是各种锅底，这里定义两种）
 */
public class DaLongYan implements GuoDi {
    public float cost() {
        return 59.0f;
    }

    public String name() {
        return "大龙燚火锅原味锅底";
    }
}
