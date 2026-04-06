

class EcommerceDemo {

    static class Product {
        String name;
        double price;

        Product(String n, double p) {
            name = n;
            price = p;
        }
    }

    static class Customer {
        String name;

        Customer(String n) {
            name = n;
        }
    }

    static class Order {
        Product product;
        int quantity;

        Order(Product p, int q) {
            product = p;
            quantity = q;
        }

        double calculateTotal() {
            return product.price * quantity;
        }

        void display() {
            System.out.println("Product: " + product.name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + calculateTotal());
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Amit");
        Order o = new Order(p, 2);

        System.out.println("Customer: " + c.name);
        o.display();
    }
}