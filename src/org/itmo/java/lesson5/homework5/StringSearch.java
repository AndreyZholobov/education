package org.itmo.java.lesson5.homework5;


public class StringSearch {

    //1.	Написать метод для поиска самого длинного слова в тексте
    public static String getLongestWord(String word) {
        int len = 0;
        String longest = "";
        for (String string : word.split(" ")) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }

    //2.	Написать метод, который проверяет являться ли слово палиндромом.
    public static Boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }

    //3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static String replaceWord(String text, String word, String zamena) {
        StringBuilder builder = new StringBuilder();
        for (String s : text.split(" ")) {
            if (s.equalsIgnoreCase(word)) {
                builder.append(zamena);
            } else if (s.toLowerCase().contains(word.toLowerCase())) {
                int beginIndex = s.toLowerCase().indexOf(word.toLowerCase());
                String substring = s.substring(beginIndex, word.length() + beginIndex);
                String s1 = s.replaceAll(substring, zamena);
                builder.append(s1);

            } else {
                builder.append(s);
            }

            builder.append(" ");
        }

        return builder.toString();

    }

    //4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public static Integer getCountString(String text, String word) {
        return text.split(word, -1).length - 1;
    }

    /*
    5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
Sample Output:
The given string is: This is a test string
The string reversed word by word is:
sihT si a tset gnirts
     */

    public static String reversWord(String text) {
        StringBuilder builder = new StringBuilder();
        for (String s : text.split(" ")) {
            StringBuilder sb = new StringBuilder(s);
            builder.append(sb.reverse()
                    .append(" "));
        }
        return builder.toString();
    }

}
