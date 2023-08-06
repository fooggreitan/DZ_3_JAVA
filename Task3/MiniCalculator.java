package Task3;

import java.util.HashMap;
import java.util.Scanner;

public class MiniCalculator {

    static int cost;
    static HashMap<Integer, Character> h = new HashMap<>();
    
    /**
     * Метод для просмотра истории
     */
    public static void history() {
        System.out.print("История: " + h);
    }

    /**
     * Метод для ввода чисел
     */
    public static void operaton() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /, ^): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = calculate(num1, operator, num2);
            
            cost += 1;
            h.put(cost, operator);

            System.out.println("Результат: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    /**
     * Метод для выбора операций
     * @param num1
     * @param operator
     * @param num2
     * @return
     * @throws Exception
     */
    public static double calculate(double num1, char operator, double num2) throws Exception {
        switch (operator) {
            case '+': return Sum.sum(num1, num2);
            case '-': return Difference.difference(num1, num2);
            case '*': return Multiplication.multiplication(num1, num2);
            case '/': return Division.division(num1, num2);
            case '^': return Degree.degree(num1, num2);
            default: throw new InvalidInputException("Недопустимая операция");
        }
    }
}