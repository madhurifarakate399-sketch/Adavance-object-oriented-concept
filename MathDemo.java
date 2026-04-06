

class MathDemo {

    static double floorValue(double num) {
        return Math.floor(num);
    }

    static double ceilValue(double num) {
        return Math.ceil(num);
    }

    static long roundValue(double num) {
        return Math.round(num);
    }

    public static void main(String[] args) {

        double num = 5.7;

        System.out.println("Number: " + num);
        System.out.println("Floor: " + floorValue(num));
        System.out.println("Ceil: " + ceilValue(num));
        System.out.println("Round: " + roundValue(num));
    }
}