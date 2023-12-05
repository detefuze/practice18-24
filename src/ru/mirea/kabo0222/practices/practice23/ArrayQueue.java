package ru.mirea.kabo0222.practices.practice23;

public class ArrayQueue {
    private final int SIZE = 5;
    private int front, rear;
    private final int[] items = new int[SIZE];
    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return front == rear + 1;
    }

    // Проверяем, не пуста ли очередь
    boolean isEmpty() {
        return front == -1;
    }

    // Добавляем новый элемент
    public void enQueue(int element) {
        if (isFull())
        {
            System.out.println("Очередь заполнена");
        }
        else
        {
            if (front == -1) front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Добавлено значение " + element);
        }
    }

    // Удаление элемента
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = this.items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /*  Внутри Q только один элемент, поэтому очередь сбрасывается
           в начальное состояние после удаления последнего элемента */
            else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    public void display() {
        /* Функция выводит консоль статус кругового списка*/
        int i;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println("Указатель FRONT-> " + front);
            System.out.println("Элементы -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(this.items[i] + " ");
            System.out.println(this.items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public int element() {return this.items[front];}

    public int size() {return this.SIZE;}

    public void clear()
    {
        front = -1;
        rear = -1;
    }

    public int getSIZE() {
        return SIZE;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.display();
        q.deQueue();
        q.deQueue();
        q.display();
        q.enQueue(10);
        q.enQueue(12);
        q.display();
    }
}