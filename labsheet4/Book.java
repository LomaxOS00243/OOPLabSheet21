package labsheet4;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private static int count=1;
    private static int ID;

    public Book(){
        title="Title Not Available";
        price=0.00;
        ISBN="ISBN Not Available";
        pages=0;

    }
    public Book(String title, double price, String ISBN, int pages){
        this.title=title;
        this.price=price;
        this.ISBN=ISBN;
        this.pages=pages;
        incrementCount();
        setID(count);

    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPages(){
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        labsheet4.Book.count = count;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        labsheet4.Book.ID = ID;
    }
    public static void incrementCount(){
        count++;
    }

    @Override
    public String toString() {
        return  "title: " + title +
                " price: " + price +
                " ISBN: " + ISBN +
                " pages: " + pages+
                "...ID: "+getCount();
    }
}

