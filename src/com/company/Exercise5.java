package com.company;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(isDoubloon("ABBA"));
    }

    public static boolean isDoubloon(String word) {
        boolean flag = true;
        for (char c = 'A'; c <= 'Z'; c++) {
            if (!word.contains(String.valueOf(c))) {
                continue;
            }
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
            if (count != 2) {
                flag = false;
            }
        }
        return flag;
    }
}
