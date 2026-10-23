class mobile{
    String brand;
    double price;
    void display(){
        System.out.println(brand +" "+ price);
    }

    public static void main(String[] args){
        mobile m1 = new mobile();
        m1.brand = "Samsung";
        m1.price = 20000;
        m1.display();
        mobile m2 = new mobile();
        m2.brand = "apple";
        m2.price = 50000;
        m2.display();

    }
}