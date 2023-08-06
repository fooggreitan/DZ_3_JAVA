package Task3;

public class Degree {
    /**
     * Метод который выполняет возведение в степень
     * @param num1
     * @param num2
     * @return
     * @throws InvalidInputException
     */
    public static float degree(float num1, float num2) throws InvalidInputException {
        if (num1 == 0 && num2 < 0) throw new InvalidInputException("Ноль не может быть возведен в отрицательную степень.");
        return (float) Math.pow(num1, num2);
    } 
}
