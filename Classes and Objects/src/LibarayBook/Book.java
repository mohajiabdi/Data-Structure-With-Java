package LibarayBook;

public class Book {
    String title,author;
    int  year, quantity;

    public Book(){
        this.title = "JavaScript Beginner";
        this.author = "MoHaji";
        this.year = 2020;
        this.quantity = 1;
    }

    public void addBook(int quantity){
        this.quantity += quantity;
    }
    public void updateBookTitle(String title){
        this.title = title;
    }
    public void showBookInfo(){
        System.out.println("\nBook Title:  "+this.title +
                            "\nAuthor Name:  "+this.author +
                            "\nYear Published:  "+this.year+
                            "\nQuantity Available:  "+this.quantity);
    }


    public void findBook(String title){
        // find book using name of the author of the book...

        if(this.title.equalsIgnoreCase(title)){
            System.out.println("Book Found!");
        }else{
            System.out.println("Book Not Found!");
        }
    }

    public void borrowBook(int quantity){
        if(this.quantity >= quantity){
            this.quantity -= quantity;
        } else{
            System.out.println("\nSorry We don't have enough books Available!..'");
        }
    }
}
