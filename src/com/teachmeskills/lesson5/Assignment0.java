package com.teachmeskills.lesson5;

import java.util.Scanner;

public class Assignment0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int[][][] array3d = {{{9, 5, 2},{7, 3, 6}},{{3, 9, 8},{4, 4, 6}},{{7, 2, 8},{9, 5, 2}}};

        for (int[][] array2: array3d) {
            for (int[] array1 : array2) {
                for (int num : array1) {
                    num += number;
                    System.out.println(num);
                }
            }
        }
    }

}
