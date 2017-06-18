package com.lwhtarena.design;

/*************************
 * @Author: liwh
 * @Date: 2017/6/18 0:26
 * Description: 公告板
 * oo设计方案
 **************************/
public class CurrentConditions {

    /******************
     * 温度、气压、湿度
     ******************/
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature: " + mTemperature + "***");
        System.out.println("***Today mPressure: " + mPressure + "***");
        System.out.println("***Today mHumidity: " + mHumidity + "***");
    }
}
