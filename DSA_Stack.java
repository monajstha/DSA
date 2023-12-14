import java.util.Stack;

public class DSA_Stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Apple"); 
        stack.push("Orange");
        
        // ["Apple", "Orange"]. The position of the last element is at 1. 
        System.out.println(stack.search("Apple"));
        System.out.println( stack.peek());
        System.out.println(stack.empty());
    }
}

