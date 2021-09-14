package com.company;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
    }

    public static boolean canSpell(String letters, String word) {
        boolean spell = true;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!letters.contains(String.valueOf(letter))) {
                spell = false;
                break;
            } else {
                letters = letters.replaceFirst(String.valueOf(word.charAt(i)), "");
            }
        }
        return spell;
    }
}
