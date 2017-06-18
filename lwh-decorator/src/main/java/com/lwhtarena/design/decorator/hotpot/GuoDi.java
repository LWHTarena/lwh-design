package com.lwhtarena.design.decorator.hotpot;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:03
 * Description: 定义被装饰对象基类（可以是抽象类也可以是接口）
 */
public interface GuoDi {

    /******************
     * 锅底当然要有价钱啦
     ******************/
    public float cost();

    /******************
     * 名字也得有哦
     ******************/
    public String name();
}
