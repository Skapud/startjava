package com.startjava.lesson_2_3_4.project;

import java.util.Scanner;

public class BookcaseTest {
    private static final String MENU = """
                
                ------Меню:------
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. Очистить шкаф
                5. Выход
                
                Введите номер опции меню:
                """;

    public static void main(String[] args) {
        Bookcase bc = new Bookcase();
        Scanner scanner = new Scanner(System.in);
        Option answer = Option.ERROR;
        do {
            try {
                printBookShelf(bc);
                System.out.print(MENU);
                answer = Option.getMenuItem(scanner.nextInt());
                scanner.nextLine();
                selectMenu(answer, scanner, bc);
                if (answer != Option.EXIT) inputEnter(scanner);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (answer != Option.EXIT);
    }

    private static void printBookShelf(Bookcase bc) {
        if (bc.getBooksCount() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("В шкафу книг - " + bc.getBooksCount() +
                    ", свободно полок - " + (Bookcase.SHELVES - bc.getBooksCount()) + "\n");
            for (Book book : bc.getBooks()) {
                System.out.printf("|%-" + bc.getBookcaseLength() + "s|\n", book);
                System.out.println("|" + "-".repeat(bc.getBookcaseLength()) + "|");
            }
        }
    }

    private static void selectMenu(Option answer, Scanner scanner, Bookcase bc) {
        switch (answer) {
            case ADD -> save(scanner, bc);
            case DELETE -> delete(scanner, bc);
            case FIND -> find(scanner, bc);
            case CLEAR -> bc.clear();
            case EXIT -> exit();
            default -> throw new RuntimeException("Ошибка: необходимо ввести номер из списка ниже");
        }
    }

    private static void save(Scanner scanner, Bookcase bc) {
        System.out.println("Введите автора книги:");
        final String author = scanner.nextLine();
        final String title = enterTitle(scanner);
        System.out.println("Введите год издания книги:");
        final int year = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(author, title, year);
        bc.save(book);
        System.out.println("Книга сохранена");
    }

    private static void delete(Scanner scanner, Bookcase bc) {
        if (bc.delete(enterTitle(scanner))) {
            System.out.println("Книга удалена");
        }
    }

    private static void find(Scanner scanner, Bookcase bc) {
        System.out.println(bc.find(enterTitle(scanner)));
    }

    private static String enterTitle(Scanner scanner) {
        System.out.println("Введите название книги:");
        return scanner.nextLine();
    }

    private static void exit() {
        System.out.println("Завершение программы..");
    }

    private static void inputEnter(Scanner scanner) {
        String input;
        do {
            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            input = scanner.nextLine();
        } while (!input.isEmpty());
    }
}
