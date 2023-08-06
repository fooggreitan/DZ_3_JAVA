package Task1;

/* 

Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.

Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил. 

*/

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    /**
     * Метод для запуска приложения
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.print("Введите число: ");
        scanner = new Scanner(System.in);
        String prov = scanner.nextLine();
        PasswordVerifier.proverka(prov);
    }
}
