package assign29th_May_Presentation;

import java.util.Scanner;



public class Stack {
    static Scanner sc = new Scanner(System.in); // "in" is a static variable
    // which
    // is available in System class.
    static int stack[], top = -1;
    static int size;
    static {
        Stack.create();

 

    }

 

    public static void main(String[] args) {
        int ch;
        int item;

 

        while (true) {
            System.out.println("1.Push "); // Push the element into the stack
            System.out.println("2.Pop "); // pop the element from the stack
            System.out.println("3.Peek "); // collecting top element from the
            // stack
            System.out.println("4.Traverse "); // Traverse all the elements from
            // the stack
            System.out.println("5.Quit ");

 

            System.out.print("Enter Your choice : ");
            ch = Stack.sc.nextInt(); // nextInt() is a non-static method which
            // is available in Scanner class.

 

            switch (ch) {
            case 1:
                System.out.println("Entter element : ");
                item = sc.nextInt();
                Stack.push(item);
                break;

 

            case 2:
                item = Stack.pop();
                if (item == 0) {
                    System.out.println("Stack is underflow");
                } else {
                    System.out.println("Popped item : " + item);
                }
                break;

 

            case 3:
                item = Stack.peek();
                if (item == 0) {
                    System.out.println("Stack is underflow");
                } else {
                    System.out.println("Peek item : " + item);
                }
                break;

 

            case 4:
                Stack.traverse();
                break;

 

            case 5:
                System.exit(1); // exit is a static method which is availabale
                // in System class , and i will expect any
                // integer to exit.
            default:
                System.out.println("Invalid choice");

 

            }

 

        }
    }

 

    static void create() {

 

        System.out.println("Enter size of stack");
        size = Stack.sc.nextInt();
        stack = new int[size];
        System.out.println("Stack created wit hsize : " + size);

 

    }

 

    static void push(int item) {
        if (Stack.isFull()) {
            System.out.println("Stack is overflow \n");

 

        } else {

 

            stack[++top] = item;
        }
    }

 

    static boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

 

    static int pop() {
        if (Stack.isEmpty()) {
            return 0;
        } else {
            return stack[top--];
        }
    }

 

    static boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

 

    static int peek() {
        if (Stack.isEmpty()) {
            return 0;
        } else {
            return stack[top];
        }
    }

 

    static void traverse() {
        if (Stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements of stack : ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

 

    }

 

}