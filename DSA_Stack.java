import java.util.Stack;

public class DSA_Stack {
    public static void main(String[] args){
        // Stack = LIFO data structure
        Stack<String> stack = new Stack<String>();
        stack.push("Apple"); 
        stack.push("Banana");
        stack.push("Citrus");
        
        System.out.println(stack);
        System.out.println(stack.pop());
        // ["Apple", "Orange"]. The position of the last element is at 1. 
        System.out.println(stack.search("Apple")); // Search returns the position of the element and returns -1 if it can't find it
        System.out.println(stack.peek()); // Look for the item at the top of the stack
        System.out.println(stack.empty()); // checks if the stack is empty
        System.out.println(stack.size()); // returns the size of the stack
    }
}

