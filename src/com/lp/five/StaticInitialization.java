package com.lp.five;

/**
 * @author 努力常态化
 * date 2018/4/15  23:38
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println(" Creating new Cupboard() in main" );
        new Cupboard();
        System.out.println(" Creating new Cupboard() in main" );
        new Cupboard();

        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

}
