// 2. Написать реализацию очереди на основе массива;
// Реализовать методы size(), empty(), offer(), poll(), peek()

package ru.geekbrains;

public class Queue<T> {
    private T[] array;
    private int lastIndex;
    private int firstIndex;

    public Queue(int length) {
        this.lastIndex = 0;
        this.firstIndex = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.lastIndex - this.firstIndex;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void offer(T value) {
        try {
            if ((lastIndex - firstIndex) == this.array.length) throw new Exception("Queue is full");
            this.array[lastIndex++] = value;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public T peek() {
        try {
            if (this.empty()) throw new Exception("Queue is empty");
            return this.array[firstIndex];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public T poll() {
        try {
            if (this.empty()) throw new Exception("Queue is empty");
            return this.array[firstIndex++];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(5);
        queue.offer("String 1");
        queue.offer("String 2");
        queue.offer("String 3");
        queue.offer("String 4");
        queue.offer("String 5");
        System.out.printf("Size = %d\n", queue.size());
        queue.offer("String 6");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
