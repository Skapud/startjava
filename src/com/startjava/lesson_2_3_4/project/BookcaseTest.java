package com.startjava.lesson_2_3_4.project;

import java.util.Scanner;

public class BookcaseTest {
    public static void main(String[] args) {
        Bookcase bc = new Bookcase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        int answer = 1;
        do {
            try {
                switch (answer) {
                    case 1 -> input(scanner, bc);
                    case 2 -> search(scanner, bc, 2);
                    case 3 -> search(scanner, bc, 3);
                    case 4 -> bc.clear();
                    default -> throw new RuntimeException("Ошибка: необходимо ввести номер из списка ниже");
                }
                answer = selectMenu(scanner, bc);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                answer = selectMenu(scanner, bc);
            }
        } while (answer != 5);
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

    private static void search(Scanner scanner, Bookcase bc, int switchCase) {
        System.out.println("Введите название книги:");
        String name = scanner.nextLine();
        if (switchCase == 2) {
            bc.delete(name);
        } else {
            System.out.println(bc.find(name));
        }
    }

    private static int selectMenu(Scanner scanner, Bookcase bc) {
        System.out.println("Для продолжения работы нажмите клавишу <Enter>");
        scanner.nextLine();
        printBookShelf(bc);
        return printMenu(scanner);
    }

    private static void printBookShelf(Bookcase bc) {
        int bookcaseLength = 50;
        System.out.println("В шкафу книг - " + bc.getBooksCount() +
                ", свободно полок - " + (Bookcase.BOOKCASE_CAPACITY - bc.getBooksCount()) + "\n");
        for (Book book : bc.getBooks()) {
            System.out.printf("| %-48s |\n", book);
            System.out.println("|" + "-".repeat(bookcaseLength) + "|");
        }
    }

    private static int printMenu(Scanner scanner) {
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
        int answer = scanner.nextInt();
        scanner.nextLine();
        return answer;
    }
}
