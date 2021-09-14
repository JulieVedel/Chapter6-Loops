package com.company;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(isAbecedarian("abdest"));
    }

    public static boolean isAbecedarian(String word) {
        boolean flag = true;
        for (int i = 0; i < word.length() - 1; i++) {
            String letterOne = Character.toString(word.charAt(i));
            String letterTwo = Character.toString(word.charAt(i + 1));
            int diff = letterOne.compareTo(letterTwo);

            if (diff > 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
