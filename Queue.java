package grocerystore;

//Linked List Queue 

public class Queue {
 
    //fields
    private Customer first;
    private Customer last;
    private int qLength;               
    private int maxLineLength; 
    private int totalCustomers;
    
    //constructor
    public Queue(){
        
        first = null;
        last = null;
        qLength = 0;
        maxLineLength = 0; 
        totalCustomers = 0;
        
    }
    
//-------------------------------------SETTERS--------------------------
    public void setqLength(int qLength){
        this.qLength = qLength;
    }

    public void setMaxLineLength(int maxLineLength){
        this.maxLineLength = maxLineLength;
    }

    public void setTotalCustomers(int totalCustomers) {
        this.totalCustomers = totalCustomers;
    }
    
    
//-------------------------------------GETTERS--------------------------
    public int getqLength(){
        return qLength;
    }

    public int getMaxLineLength(){
        return maxLineLength;
    }

    public Customer getFirst() {
        return first;
    }

    public Customer getLast() {
        return last;
    }

    public int getTotalCustomers() {
        return totalCustomers;
    }
    
//-------------------------------------METHODS--------------------------
    public boolean isEmpty(){
        
        return first == null;
    }
    
    //add customer to the Q
    public void enqueue(Customer c){
    
        //if empty set as first element, otherwise go to end of the line
        if (isEmpty()){
            first = c;
        } 
        
        else {
            last.setNext(c);
        }
        
        last = c;
        qLength++;
    }

    //remove customer from Q          
    public void dequeue(){
        //get first element, if Q is now empty set last to null
        first = first.getNext();
        
        if(isEmpty()){
            last = null;
        }
        qLength--;
    }
    
    //print info 
    public String printInfo(){
        return "Total customers serviced: " + getTotalCustomers() + '\n'
                + "Max line length: " + getMaxLineLength(); 
    }
    
    
}
