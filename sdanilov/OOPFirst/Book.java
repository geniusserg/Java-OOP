package sdanilov.OOPFirst;

/**
 * Class: Book
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */
public class Book {

    String name;
    Author[] authors;
    double price;
    int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsString = "";
        for (int i = 0; i < authors.length; i++){
            authorsString += authors[i] + ((i==authors.length-1) ? " " : ",");
        }
        return String.format("Book[name=%s,authors={%s},price=%g,qty=%d]", name, authorsString, price, qty);
    }

    public String getAuthorsName(){
        String names = "";
        for (int i = 0; i < authors.length; i++){
            names += authors[i].getName() + ((i==authors.length-1) ? " " : ",");
        }
        return names;
    }

}
