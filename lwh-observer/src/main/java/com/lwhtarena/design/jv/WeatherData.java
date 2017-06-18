package com.lwhtarena.design.jv;

import java.util.Observable;

/***************************
 * 继承java内置的观察者模式
 * 模拟气象站
 ***************************/
public class WeatherData extends Observable {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

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
        this.setChanged();  //这一步要做，判断是否变化 bool类型
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));

    }


    /***************
     * 模拟气象站
     * @param mTemperatrue
     * @param mPressure
     * @param mHumidity
     */
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    /*****************
     *  定义类来传递参数
     *****************/
    public class Data {
        public float mTemperatrue;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperatrue, float mPressure, float mHumidity) {
            this.mTemperatrue = mTemperatrue;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }

}
