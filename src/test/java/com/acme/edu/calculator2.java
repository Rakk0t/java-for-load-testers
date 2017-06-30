package com.acme.edu;

/**
 * Created by AA.Gorbachev on 28.06.2017.
 */
public class calculator2 {
    private static double memory;
    public static int sum(int a, int b) {
        return max_min10(a + b);
    }
    public static double sum(double a, double b) {
        return max_min10(a + b);
    }

    public static int sub(int a, int b) {
        return max_min10(a - b);
    }
    public static double sub(double a, int b) {
        return max_min10(a - b);
    }

    public static int mul(int a, int b) {
        return max_min10(a * b);
    }
    public static double mul(double a, int b) {
        return max_min10(a * b);
    }

    public static int div(int a, int b) {
        return max_min10(a / b);
    }
    public static double div(double a, int b) {
        return max_min10(a / b);
    }

    public static int addToMemory(int number, int mem) {

        mem=mem+number;
        return max_min10(mem);
    }

    public static int module(int w){
       if(w < 0){
           w = -w;
       }
       return max_min10(w);
    }
    public static double getMemory() {
        return memory;
    }
    public static double module(double w){
        if(w < 0){
            w = -w;
        }
        return max_min10(w);
    }
    public static double max_min10(double w){
        if(w >= -10 & w <= 10) {
            return w;
        }else{
            if(w > 10){
                return 10;
            }else{
                return -10;
            }
        }
    }
    public static int max_min10(int w){
        if(w >= -10 & w <= 10) {
            return w;
        }else{
            if(w > 10){
                return 10;
            }else{
                return -10;
            }
        }
    }
}