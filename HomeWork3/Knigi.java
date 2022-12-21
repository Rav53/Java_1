public class Knigi {
    private String kniga_name;
    private String author;
    private Double price;
    private Integer date_of_publication;

    public Knigi(String kniga_name, String author, Double price, Integer date_of_publication, Integer numbers_of_pages) {
        this.kniga_name = kniga_name;
        this.author = author;
        this.price = price;
        this.date_of_publication = date_of_publication;
        this.numbers_of_pages = numbers_of_pages;
    }
    public String getKniga_name() {
        return kniga_name;
    }
    public void setKniga_name(String kniga_name) {
        this.kniga_name = kniga_name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Double getPrice() {
        return price;
    }
    public void setBooks_price(Double price) {
        this.price = price;
    }
    public Integer getDate_of_publication() {
        return date_of_publication;
    }
    public void setDate_of_publication(Integer date_of_publication) {
        this.date_of_publication = date_of_publication;
    }
    public Integer getNumbers_of_pages() {
        return numbers_of_pages;
    }
    public void setNumbers_of_pages(Integer numbers_of_pages) {
        this.numbers_of_pages = numbers_of_pages;
    }
    private Integer numbers_of_pages;
}