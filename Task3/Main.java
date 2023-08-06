package Task3;
/* 
Задача 3: Мини-калькулятор (ООП, исключения, коллекции) - по желанию

Создайте класс MiniCalculator, который поддерживает следующие операции:

Сложение
Вычитание
Умножение
Деление
Возведение в степень

Операции должны выполняться с использованием ООП принципов (например, каждая 
операция может быть отдельным классом). Класс должен поддерживать историю операций, 
которая хранится в коллекции. Класс также должен выбрасывать исключения при недопустимых операциях (например, деление на ноль). 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

 public class Main {

    /**
     * Метод для запуска приложения
     * @param args
     */
    public static void main(String[] args) {
        try {
            while(true){    
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n1) Калькулятор\n2) История\nВведите значение: ");
                int num = scanner.nextInt();

                scanner.nextLine();

                switch (num) {
                    case 1:
                        MiniCalculator.operaton();
                        break;
                    case 2:
                        MiniCalculator.history();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            throw new NotFormatException("Неверный ввод. Попробуйте еще раз.");
        }
    }   
}

class InvalidInputException extends Exception {
    /**
     * Исключение для недопустимых операций
     * @param message
     */
    public InvalidInputException(String message) {
        super(message);
    }
}

class NotFormatException extends InputMismatchException {
    /**
     * Исключение для неправильного ввода значений
     * @param message
     */
    public NotFormatException(String message) {
        super(message);
    }
}