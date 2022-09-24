public class Product {

    // Public her yerde gecerli demektir.
    // Fakat "private" sadece tanimlandigi "{}" blok icersinde gecerlidir.
    // Ben "this" ifadesi yerine id'den ornek vermek gerekirse "id=id" diyebilirdim fakat kafa karisikligina sebep olammak icin "_id veya this.id" oalrak da tanimlayabilirim.
    // "getter" okuma, "setter" ise yazmaya yarar.
    private int id;
    private int stockAmount;
    private String name;
    private String description;
    private double price;

    private  String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return this.name.substring(0,2)+this.id;
    }

}
