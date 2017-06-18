package com.lwhtarena.design.singleton;

/**
 * @Author: liwh
 * @Date: 2017/6/18 17:41
 * Description: 巧克力工厂
 */
public class ChocolateFactory {

    private boolean empty;
    private boolean boiled;
    public volatile static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {

        if (uniqueInstance == null) {
            /*加一个同步锁，保持原子性*/
            synchronized (ChocolateFactory.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateFactory();
                }
            }
        }

        return uniqueInstance;

    }

    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }
}
