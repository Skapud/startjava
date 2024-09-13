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
                    case 1 -> {
                        Book book = input(scanner);
                        bc.add(book);
                    }
                    case 2 -> {
                        System.out.println("Введите название удаляемой книги");
                        bc.delete(scanner.nextLine());
                    }
                    case 3 -> {
                        System.out.println("Введите название искомой книги");
                        System.out.println(bc.find(scanner.nextLine()));
                    }
                    case 4 -> bc.clear();
                    default -> throw new RuntimeException("Ошибка: необходимо ввести номер из списка ниже");
                }
                answer = menuSelection(scanner, bc);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                answer = menuSelection(scanner, bc);
            }
        } while (answer != 5);
    }

    private static Book input(Scanner scanner) {
        System.out.println("Введите автора книги:");
        final String author = scanner.nextLine();
        System.out.println("Введите название книги:");
        final String name = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        final int year = scanner.nextInt();
        scanner.nextLine();
        return new Book(author, name, year);
    }

    private static int menuSelection(Scanner scanner, Bookcase bc) {
        System.out.println("Для продолжения работы нажмите клавишу <Enter>");
        scanner.nextLine();
        bc.print();
        return printMenu(scanner);
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
