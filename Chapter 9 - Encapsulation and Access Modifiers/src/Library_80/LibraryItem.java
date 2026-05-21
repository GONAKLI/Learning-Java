package Library_80;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    protected void checkOut(){
        System.out.println("you have been checked out from library");
    }
    protected void returnItem(){
        System.out.println("Thanks for return this item");
    }
}
