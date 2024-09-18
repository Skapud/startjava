package com.startjava.lesson_2_3_4.project;

import java.util.Scanner;

public enum Option {
    ADD(1),
    DELETE(2),
    FIND(3),
    CLEAR(4),
    EXIT(5),
    ERROR(-1);

    private final int option;

    Option(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static Option getUserInput(Scanner scanner) {
        int answer = scanner.nextInt();
        scanner.nextLine();
        for (Option option : Option.values()) {
            if (option.getOption() == answer) {
                return option;
            }
        }
        return Option.ERROR;
    }
}
