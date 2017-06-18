package com.lwhtarena.design;

/**
 * @Author: liwh
 * @Date: 2017/6/18 0:26
 * Description: 主函数
 * oo设计方案(有问题：扩展性不好)
 * 存在问题，无法动态添加第三方业务
 */
public class InternetWeather {

    public static void main(String[] args) {

        CurrentConditions currentConditions =new CurrentConditions();
        WeatherData weatherData =new WeatherData(currentConditions);

        weatherData.setData(30, 150, 40);
    }

}
