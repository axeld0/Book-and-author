public class Main {
    public static void main(String[] args) {
        Author newAuthor = new Author("Joshua", "Bloch", "joshua@gmail.com", "M");
        System.out.println(newAuthor.toString());
        Book newBook = new Book("Effective Java",450,150, newAuthor.getName()+newAuthor.getSurname());
        System.out.println(newBook.toString());
        newBook.setPrice(500);
        newBook.setStock(200);
        System.out.println(newBook.toString());

        

    }
}