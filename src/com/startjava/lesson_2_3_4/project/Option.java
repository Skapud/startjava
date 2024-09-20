package com.startjava.lesson_2_3_4.project;

public enum Option {
    ADD(1),
    DELETE(2),
    FIND(3),
    CLEAR(4),
    EXIT(5),
    ERROR(0);

    private final int option;

    Option(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static Option getMenuItem(int answer) {
        for (Option option : Option.values()) {
            if (option.getOption() == answer) {
                return option;
            }
        }
        return Option.ERROR;
    }
}
