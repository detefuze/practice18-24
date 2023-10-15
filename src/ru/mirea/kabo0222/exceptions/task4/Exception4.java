package ru.mirea.kabo0222.exceptions.task4;
import java.util.Scanner;

// Вывод: несмотря на существование или отсутствие ошибки, блок finally будет вызываться всегда
public class Exception4 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        String intString = sc.nextLine();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        finally
        {
            System.out.println("Block finally");
        }
    }

    public static void main(String[] args) {
        Exception4 obj = new Exception4();
        obj.exceptionDemo();
    }
}
