package ru.mirea.kabo0222.practices.practice18.task2;
import java.util.*;
public class Exception2 {
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
    }

    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        obj.exceptionDemo();
    }
}
