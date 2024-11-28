package ru.mirea.guchanova;

public class Task_8 {
    public static boolean isPalindrome(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        return isPalindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "radar";
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
