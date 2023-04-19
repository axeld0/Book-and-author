public class Book {
    private String title;
    private double price;
    private int stock;
    private String author;

    /**
     * CONSTRUCTORS
     */

    public Book(){
        title = "";
        price = 0;
        stock =0;
        author = "";

    }
    public Book(String title, double price, int stock, String author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    /**
     * GETTERS AND SETTERS
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * toString()
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author='" + author + '\'' +
                "}\n";
    }
}
