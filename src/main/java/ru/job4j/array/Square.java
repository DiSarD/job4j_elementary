package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
      int[] array = calculate(4);
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
    }
}
