package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidPin {
    public static boolean isValidPin(String pin){
        boolean validPin;
        List<Character> list = new ArrayList<>(
                pin.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toList())
        );
        if(pin.length() != 4 && pin.length() != 6){
            validPin = false;
        }else {
            validPin = list.stream().allMatch(c -> !Character.isWhitespace(c) && Character.isDigit(c));
        }
        System.out.println(validPin);
        return validPin;
    }
}
