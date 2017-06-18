package com.lwhtarena.design.jv;

/********************
 *  主函数 调用
 ********************/
public class InternetWeather {
    public static void main(String[] args) {

        CurrentConditions currentConditions  = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherData weatherData = new WeatherData();

        /***************
         *  注册观察者
         ***************/
        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);
        weatherData.setData(30, 150, 40);

        weatherData.deleteObserver(currentConditions);
        weatherData.setData(35, 150, 60);

    }
}
