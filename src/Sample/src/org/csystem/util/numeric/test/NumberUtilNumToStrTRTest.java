package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.numeric.NumberUtil.getDigitsInThrees;
import static org.csystem.util.numeric.NumberUtil.numToStrTR;

import static org.csystem.util.array.ArrayUtil.print;

public class NumberUtilNumToStrTRTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz: ");
        int n = kb.nextInt();

        for (int i = 0; i < n; ++i) {
            long val = r.nextLong();

            int [] digitsInThrees = getDigitsInThrees(val);

            print(digitsInThrees, '_');

            System.out.printf(" -> %s%n", numToStrTR(val));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
