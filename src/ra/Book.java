package ra;

public class Book {
    // thuộc tính (thuộc tính instance)
    public static String genre = "Thiếu nhi";
    static {
        genre ="Khoa học viên tưởng";
    }

    private String bookName;
    private double bookPrice;
    private int totalPages;
    private String authorName;
    // thuộc tính static


    // tồn tại 1 constructor (phương thức khởi tạo đối tương) mặc đinh không tham số nếu không định nghĩa
    public Book(String bookName,double bookPrice, int totalPages, String authorName){
        this.bookName = bookName;
        this.totalPages = totalPages;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
    }
    public Book(){
        // không làm gì
        this.bookName = "chưa có tên";
    }

    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    // phương thức (instance method)
    public void read(){
        System.out.println("Đang đọc sách");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
