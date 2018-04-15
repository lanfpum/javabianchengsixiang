package com.lp.five;

/**
 * @author 努力常态化
 * date 2018/4/15  23:56
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    public Cups() {
        System.out.println("Cups()");
    }
}
