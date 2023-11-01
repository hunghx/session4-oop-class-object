package ra;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.genre = "sách tâm lí";
        Book book2 = new Book();
        book2.genre = "sách toán học";
        System.out.println(book1.getBookName());

        System.out.println(Book.genre);
        System.out.println(book1.genre);
        System.out.println(book2.genre);

        main.Main.changeBookName(book1);
        System.out.println(book1.getBookName());
    }
}
