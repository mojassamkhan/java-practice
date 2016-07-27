public class Stack {
    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[5];
        top = -1;
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow error");
        } else {
            top++;
            arr[top] = x;
            printStack();
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow error");
            return Integer.MIN_VALUE;
        } else {
            int n = arr[top];
            top--;
            printStack();
            return n;
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

