

class LibraryDemo {

    static class Book {
        String title, author, isbn;

        Book(String t, String a, String i) {
            title = t;
            author = a;
            isbn = i;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    static class Member {
        String name;
        int id;

        Member(String n, int i) {
            name = n;
            id = i;
        }

        void display() {
            System.out.println("Member Name: " + name);
            System.out.println("Member ID: " + id);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", "12345");
        Member m = new Member("Rahul", 101);

        b.display();
        m.display();
    }
}
