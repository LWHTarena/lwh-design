package com.lwhtarena.design;

/**
 * @Author: liwh
 * @Date: 2017/6/18 0:19
 * Description: 模拟气象网站
 * oo设计方案
 */
public class WeatherData {

    /******************
     * 温度、气压、湿度
     ******************/
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    /*******
     * 注册公告板
     *******/
    private CurrentConditions mCurrentConditions;

    public WeatherData() {
    }

    public WeatherData(CurrentConditions mCurrentConditions) {
        this.mCurrentConditions = mCurrentConditions;
    }

    public float getTemperature() {
        return mTemperatrue;

    }

    public float getPressure() {
        return mPressure;

    }

    public float getHumidity() {
        return mHumidity;

    }

    public void dataChange() {
        mCurrentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    /*****************
     * 模拟气象站的通知
     * @param mTemperature
     * @param mPressure
     * @param mHumidity
     */
    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
}
