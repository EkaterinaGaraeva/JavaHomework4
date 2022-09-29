// 1. Взять за основу реализацию стека, написанную в конце семинара.
// Добавить проверку граничных условий и выводить сообщения об ошибках,
// если мы пытаемся извлечь элемент из пустого стека, добавить элемент
// в полностью заполненный стек и тд

package ru.geekbrains;

public class Stack<T> {
    private T[] array;
    private int index;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void push(T value) {
        try {
            if (index == this.array.length) throw new Exception("Stack is full");
            this.array[index++] = value;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public T peek() {
        try {
            if (this.empty()) throw new Exception("Stack is empty");
            return this.array[index - 1];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public T pop() {
        try {
            if (this.empty()) throw new Exception("Stack is empty");
            return this.array[--index];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");
        stack.push("String 5");
        stack.push("String 6");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
