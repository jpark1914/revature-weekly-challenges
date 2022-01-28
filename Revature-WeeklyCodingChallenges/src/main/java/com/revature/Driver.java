package com.revature;

import static com.revature.ValidPin.isValidPin;

public class Driver {
    public static void main(String[] args) {
        isValidPin("121317");   //true
        isValidPin("1234");     //true
        isValidPin("45135");    //false
        isValidPin("89abc1");   //false
        isValidPin("900876");   //true
        isValidPin(" 4983");    //false
    }
}
