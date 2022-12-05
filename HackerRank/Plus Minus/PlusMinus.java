package data.structure.and.algorith;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float neg = 0, pos = 0, zero = 0;
        for (Integer n : arr) {
            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("%1.6f\n", pos / arr.size());
        System.out.printf("%1.6f\n", neg / arr.size());
        System.out.printf("%1.6f\n", zero / arr.size());
    }
}
