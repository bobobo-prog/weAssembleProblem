package DTOs;

public class Product {


    private Integer quantity;
    private Integer eachPrice;




    public Product() {

    }

    public Product(Integer quantity, Integer eachPrice) {
        this.quantity = quantity;
        this.eachPrice = eachPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getEachPrice() {
        return eachPrice;
    }

    public void setEachPrice(Integer eachPrice) {
        this.eachPrice = eachPrice;
    }

    @Override
    public String toString() {
        return "Product{  " + "quantity=" + quantity + ", eachPrice=" + eachPrice+" Rs" + " totalPrice="+eachPrice*quantity+" Rs"+ '}';
    }
}
