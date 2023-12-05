package ru.mirea.kabo0222.practices.practice22;

import java.util.*;

public class Calculator {
    private final Stack<Integer> stack = new Stack<>();
    public int calculate(String command)
    {
        if (command.isEmpty()) return 0;
        String[] strings = command.split(" ");
        for (int i = 0; i < strings.length; i++)
        {
            if (isNumeric(strings[i])) stack.push(Integer.parseInt(strings[i]));
            else
            {
                try {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    switch (strings[i]) {
                        case "+" -> stack.push(num1 + num2);
                        case "-" -> stack.push(num2 - num1);
                        case "*" -> stack.push(num1 * num2);
                        case "/" -> stack.push(num2 / num1);
                    }
                }
                catch (EmptyStackException | ArithmeticException e) {return 0;}
            }
        }
        if (stack.size() == 1) return stack.pop();
        else return 0;
    }

    private static boolean isNumeric(String d)
    {
        try
        {
            Integer.parseInt(d);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String message = sc.nextLine();
        System.out.println(new Calculator().calculate(message));
    }
}
