package HomeWork04;

import java.util.Stack;

public class Task2323 {
    public static void main(String[] args) {
        class MyQueue {
            Stack<Integer> qx = new Stack<Integer>();
            Stack<Integer> qy = new Stack<Integer>();

            /** Поместить элемент x в конец очереди. */
            public void push(int x) {
                while (!qx.isEmpty()) {
                    qy.push(qx.pop());
                }
                qx.push(x);
                while (!qy.isEmpty()) {
                    qx.push(qy.pop());
                }
            }
            /** Удаляет элемент из начала очереди и возвращает этот элемент. */
            public int pop() {
                return qx.pop();
            }
            /** Получить передний элемент. */
            public int peek() {
                return qx.peek();

            }
            /** Возвращает, пуста ли очередь. */
            public boolean empty() {
                return qx.isEmpty();

            }
        }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

    }
}
