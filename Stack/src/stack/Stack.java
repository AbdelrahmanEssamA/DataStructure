package stack;

/**
 *
 * @author Abdo
 */
public class Stack {

    int capacity = 3;
    int stack[] = new int[capacity];
    static int top;

    public Stack() {
        top = -1;
    }

    public void showElement() {
        System.out.print("stack: ");
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public int size() {

        return top + 1;
    }

    public void push(int data) {
        if (capacity == size()) {
            expandStack();
        }
        System.out.println(data + " pushed into stack");
        stack[++top] = data;

    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[top];
            stack[top--] = 0;
            System.out.println(x + " pushed into stack");
            shrinkStack();
            return x;
        }
    }

    public void peak() {
        if (top < 0) {
            System.out.println("nothing to see");
        } else {
            System.out.println("the number at the top is : " + stack[top]);
        }
    }

    private void expandStack() {
        int newStack[] = new int[size() + 2];
        for (int i = 0; i < size(); i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        capacity = newStack.length;

    }

    private void shrinkStack() {
        if (size() <= capacity / 2) {
            int newStack[] = new int[capacity / 2];
            for (int i = 0; i < size(); i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            capacity = newStack.length;
        }
    }

    public boolean isEmpty() {
        return (top < 0);
    }

}
