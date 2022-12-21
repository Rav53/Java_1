public class NewThings {

    private String name;
    private String country;
    private Double weight;
    private Double prices;
    private String sort;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getPrices() {
        return prices;
    }
    public void setPrices(Double prices) {
        this.prices = prices;
    }
    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
    public NewThings(String name, String country, Double weight, Double prices, String sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.prices = prices;
        this.sort = sort;
    }
}
