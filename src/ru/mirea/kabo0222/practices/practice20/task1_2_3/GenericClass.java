package ru.mirea.kabo0222.practices.practice20.task1_2_3;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>,V extends Serializable,K> {
    private final T var1;
    private final V var2;
    private final K var3;

    public GenericClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "var1=" + var1.getClass() +
                ", var2=" + var2.getClass() +
                ", var3=" + var3.getClass() +
                '}';
    }
}
