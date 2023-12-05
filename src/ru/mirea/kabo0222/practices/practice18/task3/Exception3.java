package ru.mirea.kabo0222.practices.practice18.task3;
import java.util.Scanner;

// Вывод: когда мы ловим Exception, то ловим все виды исключений (потомков) класса Exception
public class Exception3 {
    public void exceptionDemo()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        String intString = sc.nextLine();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Exception3 obj = new Exception3();
        obj.exceptionDemo();
    }
}
