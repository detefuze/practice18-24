package ru.mirea.kabo0222.exceptions.task5_6;

public class ThrowsDemo {
    public void printMessage(String key)
    {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key)
    {
        if (key == null)
        {
            try
            {
                throw new NullPointerException("null key in getDetails");
            }
            catch (NullPointerException e)
            {
                new ThrowsDemo().printMessage(String.valueOf(e));
            }
        }
        return "data for "+key;
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.printMessage(null);
    }
}
