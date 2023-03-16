public class GenericStackClient {
    private static void stackOfIStrings () {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("After pushing: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n Size of stack after poping: " + stack.size());
    }
    private static void stackOfInteger () {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("After pushing: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n Size of stack after poping: " + stack.size());
    }

    public static void main(String[] args) {
        stackOfInteger();
        stackOfIStrings();
    }


}
