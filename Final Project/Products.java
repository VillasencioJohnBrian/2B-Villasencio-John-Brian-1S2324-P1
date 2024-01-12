class Products {

    private String name;
    

    public String getProduct() {
        return name;
    }
    public void setProduct(String Product) {
        this.name = Product;
    }
    
    public Products(String Product ){
        this.name = Product;
      
    }
    
    public void displayProducts() {
        
        System.out.println(name);

    }
    
    

}