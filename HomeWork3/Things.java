public class Things {

    private String name;
    private Double price;
    private String sort;

    public Things(String name, Double price, String sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getSort(){
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
}
