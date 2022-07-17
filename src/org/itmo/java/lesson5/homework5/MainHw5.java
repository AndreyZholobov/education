package org.itmo.java.lesson5.homework5;

public class MainHw5 {

    public static void main(String[] args) {

        String palindrome = "шалаш";
        String text = "Мне бяка нравиться больше бяка чего-либо в разработке ПО делать фреймворки, " +
                "Бяка позволяющие другим разработчикам создавать что-то крутое. БЯКА Иногда, в погоне за " +
                "идеальным кодом, ко мне на ум приходят странные идеи, но бякАпри реализации который C# может " +
                "дойти до предела своих возможностей. Не так давно произошёл подобный случай, когда БЯКА и мы " +
                "вместе с коллегой искали способ избежать передачи большого количества типовых параметров в тех " +
                "местах, где компилятор должен был по идее их вывести. Однако бяКа , C# так устроен, что способен " +
                "выводить типы в обобщённых вызовах только из передаваемых параметров метода.";
        String byaka = "бяка";
        String zamena = "[вырезано цензурой]";

        System.out.println("Исходный текст: " + text);
        System.out.println("Самое большое слово: " + StringSearch.getLongestWord(text));
        System.out.println(palindrome + " является ли палиндромом: " + StringSearch.isPalindrome(palindrome));
        System.out.println(StringSearch.replaceWord(text, byaka, zamena));

        System.out.println();
        System.out.println(StringSearch.getCountString(text, byaka));

        System.out.println();
        System.out.println(StringSearch.reversWord(text));

    }
}
