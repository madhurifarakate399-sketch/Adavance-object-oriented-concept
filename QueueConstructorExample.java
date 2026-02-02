import java.util.LinkedList;
import java.util.Queue;

public class QueueConstructorExample {
    Queue<Integer> q;

    QueueConstructorExample() {
        q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
    }

    void display() {
        System.out.println("Queue: " + q);
        System.out.println("Remove: " + q.remove());
        System.out.println("After Remove: " + q);
    }

    public static void main(String[] args) {
        QueueConstructorExample obj = new QueueConstructorExample();
        obj.display();
    }
}
