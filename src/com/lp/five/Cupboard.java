package com.lp.five;

/**
 * @author 努力常态化
 * date 2018/4/15  23:35
 */
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        bowl4.f1(2);
    }

    void f3(int maker) {
        System.out.println("f3( " + maker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}
