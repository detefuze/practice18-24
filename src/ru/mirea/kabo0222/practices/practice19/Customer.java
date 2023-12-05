package ru.mirea.kabo0222.practices.practice19;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Customer {
    private final String SNP;
    private final int INN;

    public Customer(String SNP, int INN) {
        this.SNP = SNP;
        this.INN = INN;
    }

    public String getSNP() {
        return SNP;
    }

    public int getINN() {
        return INN;
    }

    public void purchase()
    {
        System.out.println("Введите свой ИНН: ");
        try
        {
            Scanner sc = new Scanner(System.in);
            int INN = sc.nextInt();
            if (this.INN != INN)
            {
                throw new IncorrectINNException("Incorrect INN");
            }
            else
            {
                throw new InputMismatchException();
            }
        }
        catch (IncorrectINNException | InputMismatchException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Покупка успешно завершена!");
    }
    @Override
    public String toString() {
        return "Customer{" +
                "SNP='" + SNP + '\'' +
                ", INN=" + INN +
                '}';
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Петров Петр Анатольевич", 127342);
        c1.purchase();
    }
}
