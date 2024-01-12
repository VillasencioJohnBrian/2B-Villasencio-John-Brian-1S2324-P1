class Tv extends Products {
    public Tv (String productName) {
        super(productName);
    }
     private String brand;
    private double price;
    public String getBrand () {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
   
    public void setPrice(double brandPrice) {
        this.price = brandPrice;
    }
    public void setBrand(String ProductBrand) {
        this.brand = ProductBrand;

    }
    public void displayBrand() {
        System.out.println(brand+" $"+price);
        
    }
    
}
