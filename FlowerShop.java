/**
 * Decsription : acts as a driver class for the flower management system. 
 * Programmer : Ezzah
 * Date : 19 February 2024
 */ 

//import the respective package
import javax.swing.JOptionPane;
//driver class
public class FlowerShop {
    //driver method
    public static void main(String[] args) {
        //create an array of flower named FlowerArr with size [10]
        Flower[] flowerARR = new Flower[10];
        
        //declare all the variables
        String name, color, P, Q;
        double price;
        int quantity;

        //ask the user to enter necessary data
        for (int i = 0; i < flowerARR.length; i++) 
        {
            name = JOptionPane.showInputDialog(null, "Enter name of the flower : ");
            color = JOptionPane.showInputDialog(null, "Enter the color : ");
            P = JOptionPane.showInputDialog(null, "Enter price : ");
            price = Double.parseDouble (P); //wrapped from string to double
            Q = JOptionPane.showInputDialog(null, "Enter quantity : ");
            quantity = Integer.parseInt (Q); //wrapped from string to integer
            
            //instantiate each element of the array
            flowerARR[i] = new Flower(name, color, price, quantity);
            
            //call for mutator
            flowerARR[i].setFlower(name, color, price, quantity); 
            
            //call the toString method
            System.out.println(flowerARR[i].toString());
        } //end of for

        //display all flower details
        StringBuilder FlowersDetails = new StringBuilder("All Flower Details:\n");
        for (Flower f : flowerARR) 
        {
            FlowersDetails.append(f).append("\n");
        } //end of for
        JOptionPane.showMessageDialog(null, FlowersDetails.toString());

        //calculate total value of flower
        double total = 0; //declare total attribute
        for (Flower f: flowerARR) 
        {
            total = f.getPrice() * f.getQuantity();
        } //end of for
        
        JOptionPane.showMessageDialog(null, "Total price of Flower is : RM" + total);

        //search for a flower by name
        String search = JOptionPane.showInputDialog(null, "Enter the name of the flower to search:");
        boolean found = false;
        
        StringBuilder flower2 = new StringBuilder();
        for (Flower f : flowerARR) 
        {
            if (f.getName().equalsIgnoreCase(search)) 
            {
                flower2.append("\nFlower Found:\n").append(f);
                found = true;
                break;
            } //end of if
        } //end of for
        
        if (!found) 
        {
            flower2.append("\nFlower not founded.");
        } //end of if
        JOptionPane.showMessageDialog(null, flower2.toString());

        //restock a specific flower in the inventory
        String restock = JOptionPane.showInputDialog(null, "Enter the name of the flower to restock:");
        int restockQ = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity to restock:"));
        
        for (Flower f : flowerARR) 
        {
            if (f.getName().equalsIgnoreCase(restock)) 
            {
                f.setQuantity(f.getQuantity() + restockQ);
                JOptionPane.showMessageDialog(null, "Restock successful!!" + flower2);
                break;
            } //end of if
        } //end of for
    } //end of main
}//end of class
