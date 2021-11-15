package fr.masteril.tp3spring.modele;

public class Book{
    private final int id;
    private String title;
    private String author;
    private String description;
    private String shop;
    private float price;

    public Book(String title, String author, String description, String shop, float price) {
        this.id = IdGenerator.generateId();
        this.title = title;
        this.author = author;
        this.description = description;
        this.shop = shop;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void update(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.description = book.description;
        this.shop = book.shop;
        this.price = book.price;
    }
}
