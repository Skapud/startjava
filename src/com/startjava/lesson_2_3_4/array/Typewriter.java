package com.startjava.lesson_2_3_4.array;

public class Typewriter {
    public static void main(String[] args) {
        Typewriter tw = new Typewriter();
        tw.Init("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling");
        tw.Init("Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin");
        tw.Init("null");
        tw.Init("");
    }

    private void Init(String Message) {
//        delimiter = " "
//
//        split_string = string.split(delimiter)
//        print(split_string)

    }
}
