package allLists;

import java.util.Stack;

public class StackList
{
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<Object>();
        stack.push("Hamdullah");
        stack.push("Hamdard");
        stack.push("khan");
        stack.push("Jan");
        stack.push("Haji Hamdard");

        stack.add("this is Hamdullah Hamdard in Kandahar medical faculty");

        // important function in Stack
        System.out.println(stack.empty());// is stack empty or not
        stack.pop();// remove the last element from stack
        System.out.println(stack.search("khanooooo"));

        // display the last element of the stack
        System.out.println("peek the items: "+stack.peek());

        stack.add("Khanooooooooo");

        System.out.println(stack);
    }
}
