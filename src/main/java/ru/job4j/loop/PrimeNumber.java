package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
       int count = 0;
       for (int num = 2; num <= finish; num++) {
           if (CheckPrimeNumber.check(num)) {
               count++;
           }
       }
       return count;
    }
}
