package main;

import ra.Book;


public class Main {
    public static void main(String[] args) {

       // tạo 1 cuốn sách
        Book book1 = new Book("Dế mèn phưu lưu kí",100,200,"Tô Hoài"); // book1 là 1 đối tượng được tạo ra từ lớp ra.Book
        // book1 là 1 instance của lớp ra.Book
        // thay đổi giá tiền
        book1.setBookPrice(1000);
        System.out.println(book1.getBookPrice());
        System.out.println(" tên sách "+book1.getBookName());
        Book book2 = new Book("Bình Ngô Đại Cáo",200,500,"Nguyễn Trãi");
        System.out.println(" tên sách "+book2.getBookName());
        Book book3; // ban đầu mang giá trị là null
        book3 = new Book(); // giá trị của đối tượng sẽ lưu vào heap
        // địa chỉ tham chiếu của đối tượng lại lưu vào vùng nhớ stack

        // truy xuất thuộc tính
        System.out.println(book3.getAuthorName());
        // gọi phương thức
        book3.read();

        changeBookName(book3);
        System.out.println(book3.getBookName());
        int b=10;
        changeValueNumber(b);
        System.out.println(b);
    }

    public static void changeBookName(Book book){
        book.setBookName("Đã đổi tên");

        // thay đổi giá trị của thuộc tính bookName
    }

    public static void changeValueNumber(int a){
        a = 100;
    }
}