package Homework_lesson3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int index = (int) (Math.random() * words.length);
        String scan;
        String word = words[index];
        do {
            System.out.println("Введите слово");
            scan = sc.nextLine();
            if (word.equals(scan)) {
                System.out.println("угадал");
            } else {
                int l = word.length();
                if (l > scan.length()) l = scan.length();

                int val = 15 - l;
                for (int i = 0; i < l; i++) {
                    if (word.charAt(i) == scan.charAt(i)) {
                        System.out.print(scan.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }

                for (int i = 1; i < val; i++)
                    System.out.print('#');
            }
        } while (!scan.equals(word));
    }
}