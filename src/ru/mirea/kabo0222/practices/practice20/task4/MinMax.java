package ru.mirea.kabo0222.practices.practice20.task4;

public class MinMax<T extends Comparable<T>> {
    private final T[] mas;

    public MinMax(T[] mas)
    {
        this.mas = mas;
    }

    public T min()
    {
        T min = mas[0];
        for (T i : mas)
            if (min.compareTo(i) > 0) min = i;
        return min;
    }

    public T max()
    {
        T max = mas[0];
        for (T i : mas)
            if (max.compareTo(i) < 0) max = i;
        return max;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1,23,564,21,1,-2, 34, 0};
        Double[] array2 = {1.,23.,564.,21.,1.,-2., 34., 0.};
        MinMax<Integer> obj1 = new MinMax<>(array1);
        MinMax<Double> obj2 = new MinMax<>(array2);
        System.out.println(obj1.min());
        System.out.println(obj1.max());
        System.out.println(obj2.min());
        System.out.println(obj2.max());
    }
}
