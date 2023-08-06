package Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Метод для чтения файла
     * @throws NotReadFiteException
     */
    public static void reader() throws NotReadFiteException {
        
        StringBuilder readResult = new StringBuilder();

        try(FileReader reder = new FileReader("Task2\\file.txt")) {
            int i = reder.read();
            while(i != -1) {
                readResult.append((char)i);
                i = reder.read();
            }
            reder.close();
            System.out.println("Содержимое файла: " + readResult);
        }
        catch (IOException e) {
            throw new NotReadFiteException("Чтение файла не осуществено");
        }
    }

    /**
     * Метод для записи значений в файл
     * @throws NotCopyFiteException
     */
    public static void writer() throws NotCopyFiteException {
        try (FileReader reder= new FileReader("Task2\\file.txt")) {
            System.out.println("Введите текст для записи: ");
            String write = scanner.nextLine();
            FileWriter writer = new FileWriter("Task2\\file.txt");
            
            writer.write(write);
            
            reder.close();
            writer.close();
        }
        catch (IOException e) {
            throw new NotCopyFiteException("Запись в файл не осуществено");
        }
    }

    /**
     * Метод для копирования значений в другой файл
     * @throws NotCopyFiteException
     */
    public static void copy() throws NotCopyFiteException {
        int data;

        try(FileReader reder= new FileReader("Task2\\file.txt")){
            FileWriter writer = new FileWriter("Task2\\\\copy_file.txt");
        
            while ((data = reder.read()) != -1) {
                writer.write(data);
            }

            reder.close();
            writer.close();

            System.out.println("Копирование совершено");
        }
        catch(IOException e) {
            throw new NotCopyFiteException("Копирование не совершено");
        }    
    }
}
