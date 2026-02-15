package lab04tasks;

public class Mobile {
    //sample data members
    String brandName;
    String model;
    double price;

    //parameterized constructor, will be chained to default after
    Mobile(String brand, String mod, double cost){
        this.brandName = brand;
        this.model = mod;
        this.price = cost;
    }

    //default constructor, chain with above constructor by using 'this' keyword
    //and inserting inputs in order, no duplicate initialization/names required
    Mobile(){
        this("Unknown", "Out-dated",150.40);
    }

    //display method
    void display(){
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------\n");
    }

    public static void main(String[] args){
        Mobile m1 = new Mobile();
        System.out.println("Default Constructor:");
        m1.display();
        Mobile m2 = new Mobile("Iphone", "16 Pro Max", 655.50);
        System.out.println("Parameterized Constructor:");
        m2.display();
    }

}
