package Task1;

public class PasswordVerifier {
    /**
     * Метод для проверки правильности введённых значений для создания пароля
     * @param proverka
     * @throws Exception
     */
    public static void proverka(String proverka) throws Exception {
        if (proverka.length() < 8) throw new Exception("Пароль должен быть не менее 8 символов");
        
        boolean number = false;
        boolean alf = false;

        for (int i = 0; i < proverka.length(); i++) 
        { 
            if (Character.isDigit(proverka.charAt(i)) == true) number = true;
            else if (Character.isUpperCase(proverka.charAt(i)) == true) alf = true;
        }

        if (number != true) throw new Exception("Пароль должен содеожать хотя бы одну цифру");
        else if (alf != true) throw new Exception("Пароль должен содеожать хотя бы одну заглавную букву");
    }
}
