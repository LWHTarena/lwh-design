package com.lwhtarena.design.observer;

/**
 * @Author: liwh
 * @Date: 2017/6/18 0:17
 * Description:自定义观察subject（被依赖对象）
 *
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
