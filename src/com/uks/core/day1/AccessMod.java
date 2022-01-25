package com.uks.core.day1;

class Access{
    public int a = 10;
    protected float b = 1.5f;
    char c = 'B';
    private String d = "Pavan";
    public long e = 100000;
    protected double f = 4.8;
    boolean g = true;

    public void printProperties() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
public class AccessMod {
    void printProperties(){
        Access sc=new Access();
        sc.printProperties();
    }
    public static void main(String[] args){
        Access n =new Access();
        n.printProperties();
    }
}
