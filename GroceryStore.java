package grocerystore;
import java.util.Random;

public class GroceryStore {

    public static void main(String[] args){
        
        //create queue and set "minutes" of simulation
        Queue line = new Queue();
        int simLength = 60; 
        
        //minutes in the Grocery Store
        for(int i = 0; i < simLength; i++){
            
            //25% chance that a customer is added
            if(new Random().nextInt(4) + 1 == 3){
                
                //add new customer
                Customer C = new Customer();
                line.enqueue(C);
                
                //print Q length and increase total customers
                System.out.println("New customer added!  Queue length is now " + line.getqLength());
                line.setTotalCustomers(line.getTotalCustomers() + 1);
            }
       
            //if line isnt empty check service time of current customer and adjust
            if(line.isEmpty() == false){
                
                Customer current = line.getFirst();

                //check service time, if 0 remove customer and print info
                if(current.getServiceTime() == 0){
                    line.dequeue();
                    System.out.println("Customer serviced and removed from the queue."
                                      + "  Queue length is now " + line.getqLength());

                }

                //if line is still not empty, adjust current service time    
                if(line.isEmpty() == false){
                    line.getFirst().decServiceTime();
                }
            }
        
            //check if linelength is a new max
            if(line.getqLength() > line.getMaxLineLength()){
                line.setMaxLineLength(line.getqLength());
            }
        
            //end of iteration
            System.out.println("---------------------------------------------------------------------");
        }
        
        //print final info
        System.out.println();
        System.out.println(line.printInfo());
 
    }
    
}
