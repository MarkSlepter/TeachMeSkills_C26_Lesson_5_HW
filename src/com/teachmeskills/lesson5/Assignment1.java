package com.teachmeskills.lesson5;

import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j)%2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }

        for (String[] array2 : array) {
            System.out.print(Arrays.toString(array2));
            System.out.println();
        }

    }

}
