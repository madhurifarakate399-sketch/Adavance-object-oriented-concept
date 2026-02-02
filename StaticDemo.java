public class StaticDemo {

    static int count;

    static {
        count = 10;
        System.out.println("Static Block Executed");
    }

    static void showCount() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");

        StaticDemo.showCount();

        count = 25;

        StaticDemo.showCount();
    }
}
