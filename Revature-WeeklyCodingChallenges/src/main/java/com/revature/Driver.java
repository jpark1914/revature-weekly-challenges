package com.revature;

import com.revature.challenges.Jan31;

import static com.revature.ValidPin.isValidPin;

public class Driver {
    public static void main(String[] args) {
        Object[] objects = {1, 2, "aasf", "1", 123, 123};
        Jan31.filterOutStrings(objects);
        Jan31.multiplyBy11("9473745364784876253253263723");
    }
}
