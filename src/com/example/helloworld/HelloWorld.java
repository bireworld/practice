package com.example.helloworld;
public class HelloWorld {
    public static void main(String[] args) {
        int period = 4;
        float amount = 10;
        float rate = 0.05F;
        switch(period){
            case 4:
                amount += amount * 0.2F;
                break;
            case 3:
                amount += amount * rate;
            case 2:
                amount += amount * rate;
            case 1:
                amount += amount * rate;
        }
    }
 }