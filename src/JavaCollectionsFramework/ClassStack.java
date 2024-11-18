package JavaCollectionsFramework;

import java.util.Stack;

public class ClassStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5); // метод push() добавляет объект в Stack (похож на метод add())
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek()); // Метод peek() позволяет обратиться к элементу без его вынимания из стека

        System.out.println(stack.pop()); // Метод pop() достает элемент из стека
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }







    }
}
