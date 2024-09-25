package stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /// Basic stack operation
        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);
        numberStack.push(40);
        numberStack.push(50);

        Integer firstPop = numberStack.pop();
        Integer secondPop = numberStack.pop();
        Integer topNumber = numberStack.peek();
        boolean isEmpty = numberStack.empty();
        int stackSize = numberStack.size();
//        System.out.println(
//                "firstPop: " + firstPop + "\n" +
//                "SecondPop: " + secondPop + "\n" +
//                "topNumber: " + topNumber+ "\n" +
//                "stackSize: " + stackSize
//        );

        ///Reverse a string
        //System.out.println(reversedString("riru"));

        /// Checking Balanced Parenthesis
        //System.out.println(evenParenthesis("(Hello)"));

        /// Min stack implementation

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack);
        System.out.println("Minimum: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println(minStack);
        System.out.println("Top: " + minStack.top());    // Returns 0
        System.out.println("Minimum: " + minStack.getMin()); // Returns -2


    }

    public static String reversedString(String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversedString = new StringBuilder();
        while(!stack.empty()){
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static boolean evenParenthesis(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c== ')'){
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        //Checks if the minStack is empty or if the new value is less than or equal to the current minimum (top of minStack).This ensures that minStack always has the current minimum at its top.
        stack.push(val);
        if(minStack.empty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }


//    First checks if the main stack is not empty to avoid errors.
//    Compares the top element of stack with the top element of minStack.
//    If they're equal, it means we're removing the current minimum, so we pop from both stack and minStack.
//    If they're not equal, we only pop from the main stack.
//    This maintains the property that minStack always has the current minimum at its top.

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    @Override
    public String toString() {
        return "MinStack{" +
                "stack=" + stack +
                ", minStack=" + minStack +
                '}';
    }
}
