import java.util.Stack;

public class StackConstructorExample {
    Stack<Integer> s;


    StackConstructorExample() {
        s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
    }

    void display() {
        System.out.println("Stack: " + s);
        System.out.println("Pop: " + s.pop());
        System.out.println("After Pop: " + s);
    }

    public static void main(String[] args) {
        StackConstructorExample obj = new StackConstructorExample();
        obj.display();
    }
}
