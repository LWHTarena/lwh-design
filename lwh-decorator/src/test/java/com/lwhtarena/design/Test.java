package com.lwhtarena.design;

import com.lwhtarena.design.decorator.hotpot.GuoDi;
import com.lwhtarena.design.decorator.hotpot.decorator.MaLaNiuRou;
import com.lwhtarena.design.decorator.hotpot.decorator.MaoDu;
import com.lwhtarena.design.decorator.hotpot.type.DaLongYan;
import com.lwhtarena.design.decorator.hotpot.type.YuanYang;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:15
 * Description:  一共点了大龙燚火锅原味锅底+麻辣牛肉+大刀毛肚,共消费135
 */
public class Test {
    public static void main(String[] args) {

        GuoDi guodi = new DaLongYan();//点个大龙燚火锅原味锅底
        MaLaNiuRou y = new MaLaNiuRou(guodi);//来个麻辣牛肉
        MaoDu x = new MaoDu(y);//在麻辣牛肉的基础上再来个大刀毛肚
        System.out.println("一共点了 "+x.name()+",共消费"+x.cost());

        /*再点一次*/
        GuoDi order =new MaLaNiuRou( //麻辣牛肉
                new MaoDu( //毛肚
                        new YuanYang()));//鸳鸯火锅
        System.out.println("再次点了 "+order.name()+",再次消费"+order.cost());

    }
}
