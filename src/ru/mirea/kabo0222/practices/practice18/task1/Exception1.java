package ru.mirea.kabo0222.practices.practice18.task1;

public class Exception1 {
    public void exceptionDemo()
    {
        try {System.out.println(2/0);}
        catch (ArithmeticException e) {System.out.println("Attempted division by zero: "+e);}
    }
    public static void main(String[] args) {
        Exception1 obj = new Exception1();
        obj.exceptionDemo();
    }
}
