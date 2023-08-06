package Task2;
/* 

Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с 
файлами: чтение, запись и копирование. Каждый из этих методов должен выбрасывать 
соответствующее исключение, если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).

 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    /**
     * Метод для запуска приложения
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        while (true) {
            try {
                scanner = new Scanner(System.in);

                System.out.println("\n1) Прочитать файл\n2) Записать в файл\n3) Копировать файл\nВведите значение: ");
                int num = scanner.nextInt();

                scanner.nextLine();

                switch (num) {
                    case 1:
                        FileManager.reader();
                        break;
                    case 2:
                        FileManager.writer();
                        break;
                    case 3:
                        FileManager.copy();
                        break;
                    default:
                        System.out.println("Неверный ввод. Попробуйте еще раз.");
                }
            }
            catch (InputMismatchException e) {
                throw new NotFormatException("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}

class NotCopyFiteException extends FileNotFoundException {
    /**
     * Исключение для проверки копирования файла
     * @param message
     */
    public NotCopyFiteException(String message) {
        super(message);
    }
}

class NotWriteFiteException extends FileNotFoundException {
    /**
     * Исключение для проверки записи в файл
     * @param message
     */
    public NotWriteFiteException(String message) {
        super(message);
    }
}

class NotReadFiteException extends FileNotFoundException {
    /**
     * Исключение для проверки чтения файла
     * @param message
     */
    public NotReadFiteException(String message) {
        super(message);
    }
}

class NotFormatException extends InputMismatchException {
    /**
     * Исключение для проверки написания значений
     * @param message
     */
    public NotFormatException(String message) {
        super(message);
    }
}