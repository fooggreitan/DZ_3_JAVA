package Task3;

public class Division {
    /**
     * Метод который выполняет деление чисел
     * @param num1
     * @param num2
     * @return
     * @throws InvalidInputException
     */
    public static float division(float num1, float num2) throws InvalidInputException {
        if (num2 == 0) throw new InvalidInputException("Деление на ноль недопустимо");
        return num1 / num2;
    }
}
