package com.revature.challenges;

import java.util.LinkedList;
import java.util.List;

public class Jan31 {

    public static List<Integer> filterOutStrings(Object[] unfiltered){
        /*
        EXAMPLES
        filterArray([1, 2, "a", "b"]) ➞ [1, 2]
        filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
        filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]

        NOTES
        Zero is a non-negative integer.
        The given array only has integers and strings.
        Numbers in the array should not repeat.
        The original order must be maintained.
         */

        List<Integer> filteredList = new LinkedList<>();
        for(Object o: unfiltered){
            if(o instanceof Integer && !filteredList.contains(o)){
                filteredList.add((Integer) o);
            }
        }

        filteredList.forEach(System.out::println);
        return filteredList;
    }

    public static String multiplyBy11(String number){
        /*
        multiplyBy11("11") ➞ "121"
        multiplyBy11("111111111") ➞ "1222222221"
        multiplyBy11("1213200020") ➞ "13345200220"
        multiplyBy11("1217197941") ➞ "13389177351"
        multiplyBy11("9473745364784876253253263723") ➞ "104211199012633638785785900953"
        Tip
        There is a simple trick to multiplying any two-digit number by 11 in your head:

        Add the two digits together
        Place the sum between the two digits!
         Note if the total goes over, carry the sum on to the next digit
        // 23 * 11
        // Add together 2 and 3 to make 5
        // Place 5 between the two digits to make 253
        // 77 * 11
        // Add together 7 and 7 to make 14
        // Place 4 between the two digits to make 747
        // Carry the 1 to make 847
         */
        String result;
        StringBuilder sb = new StringBuilder();
        int addOne = 0;
        char[] arr = number.toCharArray();
        sb.append(arr[arr.length-1]);
        for(int i = arr.length - 1; i > 0; i--){
            int sum = Character.getNumericValue(arr[i]) + Character.getNumericValue(arr[i-1]) + addOne;
            int m = sum % 10;
            sb.insert(0,m);
            addOne = ((sum > 10 && m != 0) || (sum == 10)) ? 1 : 0;

            if(i == 1 && sum > 10){
                sb.insert(0, Character.getNumericValue(arr[0]) + 1);
            }else if(i == 1){
                sb.insert(0, Character.getNumericValue(arr[0]));
            }
        }
        result = sb.toString();
        System.out.println(result);
        return result;
    }
}
