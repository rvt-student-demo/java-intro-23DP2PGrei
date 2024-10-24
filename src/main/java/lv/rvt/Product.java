package lv.rvt;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public Product (String Name, double Price, int Quantity){
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public void printProduct(){
        System.out.println(this.Name + ", price " + this.Price + ", " + this.Quantity + " pcs");
    }
}
