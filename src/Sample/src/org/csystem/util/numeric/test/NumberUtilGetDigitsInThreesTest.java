package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.println;
import static org.csystem.util.numeric.NumberUtil.getDigitsInThrees;

public class NumberUtilGetDigitsInThreesTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz: ");
        int n = kb.nextInt();

        for (int i = 0; i < n; ++i) {
            long val = r.nextLong();

            System.out.printf("%d -> ", val);
            println(getDigitsInThrees(val));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
