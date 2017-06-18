package com.lwhtarena.design.model;

import com.lwhtarena.design.observer.Observer;

/**
 * @Author: liwh
 * @Date: 2017/6/18 0:21
 * Description:
 */
public class ForcastConditions implements Observer {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;

        display();
    }

    public void display() {
        System.out.println("**明天温度:" + (mTemperatrue + Math.random()) + "**");
        System.out.println("**明天气压:" + (mPressure + 10 * Math.random()) + "**");
        System.out.println("**明天湿度:" + (mHumidity + Math.random()) + "**");
    }
}
