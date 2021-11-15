package fr.masteril.tp3spring.modele;

public class Book implements Data{
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

    public Book(Data data) {
        assert (data.getClass() == Book.class): "Error : Wrong Data type, please put only Book";
        this.id = IdGenerator.generateId();
        this.title = ((Book) data).getTitle();
        this.author = ((Book) data).getAuthor();
        this.description = ((Book) data).getDescription();
        this.shop = ((Book) data).getShop();
        this.price = ((Book) data).getPrice();
    }

    public Book(){
        this.id = IdGenerator.generateId();
        this.title = "";
        this.author = "";
        this.description = "";
        this.shop = "";
        this.price = 0f;
    }

    @Override
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
}
