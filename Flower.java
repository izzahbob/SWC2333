/**
 * Description : representing different types of flowers and functionalities to manage their inventory 
 * Programmer : Ezzah
 * Date : 19 Febuary 2024
 */


//driver class
public class Flower {
    //declare all variables
    private String name, color;
    private double price;
    private int quantity;
    
    //constructor without parameter
    public Flower() 
    {
        name = null;
        color = null;
        price = 0.0;
        quantity = 0;
    }
    
    //constructors with parameter
    public Flower(String name, String color, double price, int quantity) 
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    //accessor
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //mutator/ setter
    public void setFlower (String name, String color, double price, int QT)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        quantity = QT;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //overring method from class object toString
    //to display flower details
    public String toString () 
    {
        return ("\nName : " + name + "\nColor : " + color + 
                "\nPrice : RM" + price + "\nQuantity : " + quantity);
    }
} //end of class
