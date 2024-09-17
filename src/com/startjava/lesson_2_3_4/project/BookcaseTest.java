package com.startjava.lesson_2_3_4.project;

import java.util.Scanner;

public class BookcaseTest {
    public static void main(String[] args) {
        Bookcase bc = new Bookcase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        Option answer = Option.ADD_BOOK;
        do {
            try {
                selectMenu(answer, scanner, bc);
                System.out.println("Для продолжения работы нажмите клавишу <Enter>");
                scanner.nextLine();
                printBookShelf(bc);
                printMenu();
                answer = getUserInput(scanner);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                answer = getUserInput(scanner);
            }
        } while (answer != Option.EXIT);
    }

    private static void selectMenu(Option answer, Scanner scanner, Bookcase bc) {
        switch (answer) {
            case ADD_BOOK -> input(scanner, bc);
            case DELETE_BOOK -> delete(scanner, bc);
            case FIND_BOOK -> search(scanner, bc);
            case CLEAR_BOOKCASE -> bc.clear();
            default -> throw new RuntimeException("Ошибка: необходимо ввести номер из списка ниже");
        }
    }

    private static void input(Scanner scanner, Bookcase bc) {
        System.out.println("Введите автора книги:");
        final String author = scanner.nextLine();
        System.out.println("Введите название книги:");
        final String name = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        final int year = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(author, name, year);
        bc.add(book);
    }

    private static void search(Scanner scanner, Bookcase bc) {
        System.out.println(bc.find(enterName(scanner)));
    }

    private static void delete(Scanner scanner, Bookcase bc) {
        bc.delete(enterName(scanner));
    }

    private static String enterName(Scanner scanner) {
        System.out.println("Введите название книги:");
        return scanner.nextLine();
    }

    private static void printBookShelf(Bookcase bc) {
        int bookshelfLength = countBookshelfLength(bc);
        System.out.println("В шкафу книг - " + bc.getBooksCount() +
                ", свободно полок - " + (Bookcase.BOOKCASE_CAPACITY - bc.getBooksCount()) + "\n");
        for (Book book : bc.getBooks()) {
            System.out.printf("|%-" + bookshelfLength + "s|\n", book);
            System.out.println("|" + "-".repeat(bookshelfLength) + "|");
        }
    }

    private static int countBookshelfLength(Bookcase bc) {
        int maxLength = 0;
        for (Book book : bc.getBooks()) {
            int length = book.toString().length();
            if (maxLength < length) maxLength = length;
        }
        return maxLength;
    }

    private static void printMenu() {
        String menu = """
                
                ------Меню:------
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. Очистить шкаф
                5. Выход
                
                Введите номер опции меню:
                """;
        System.out.print(menu);
    }

    private static Option getUserInput(Scanner scanner) {
        int answer = scanner.nextInt();
        scanner.nextLine();
        for (Option option : Option.values()) {
            if (option.getOption() == answer) {
                return option;
            }
        }
        return Option.ERROR;
    }

    public enum Option {
        ADD_BOOK(1),
        DELETE_BOOK(2),
        FIND_BOOK(3),
        CLEAR_BOOKCASE(4),
        EXIT(5),
        ERROR(-1);

        private final int option;

        Option(int option) {
            this.option = option;
        }

        public int getOption() {
            return option;
        }
    }
}
