package com.lwhtarena.design.singleton;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:37
 * Description:
 */
public class Singleton {

    private static Singleton uniqeInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqeInstance == null) {
            uniqeInstance = new Singleton();
        }
        return uniqeInstance;
    }
}
