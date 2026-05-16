class Book {
    String title, author, isbn;
    static int totalBooks;
    static boolean isBorrowed;
    static {
        totalBooks++;
        isBorrowed = false;
    }
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

    public void borrowBook(){
        if(!isBorrowed){
            System.out.println("you have borrowed a new book");
            totalBooks--;
            isBorrowed= true;
        }else{
            System.out.println("You already has borrowed this book, please check back later ");
        }
    }
    public void returnBook(){
    if(isBorrowed){
        System.out.println("Book Has been returned");
        totalBooks++;
        isBorrowed =false;

    }else {
        System.out.println("book is already in the library ");
    }

    }
    public static int getTotalBooks(){
        return  totalBooks;
    }


    static void main() {
        Book myBook = new Book("455");
//        myBook.borrowBook();
//        myBook.borrowBook();
        myBook.returnBook();
        System.out.println(Book.getTotalBooks());
        System.out.println(myBook.title);
    }
}
