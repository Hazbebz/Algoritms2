// Sorted linked list with a sentinel node
// Skeleton code
import java.util.Scanner;

class SortedLL
{
    // internal data structure and
    // constructor code to be added here
    class Node {
        public int data;
        public Node next;
    }
    private Node head, z;
    
    public SortedLL ()
    {
        z = new Node();
        z.next = z;
        head = z;
    }
    
    
    // this is the crucial method
    public void insert(int x)
    {
        Node prev, curr, t;
        t = new Node();//create new temporary node
        t.data = x;//data component
        
        z.data = x; prev = null; curr = head;//reassigns new pointers for insertion
        while(curr.data < x) {//while loop to sift through LL and continually reassign pointers according to order
            prev = curr;
            curr = curr.next;
        }
        t.next = curr;
        
        if(prev == null)//if the list is empty 
            head = t;
        else
            prev.next = t;//asssign node in list                 
    }    
    




    public boolean remove(int x) {
        Node prev, curr;
        z.data = x+1; prev = null; curr = head;
        
        while(curr.data < x) {
            prev = curr; curr = curr.next;
        }
        
        if(curr.data > x) return false;
        
        if( prev == null)
            head = curr.next;
        else
            prev.next = curr.next;
        return true;
    }



    public boolean isEmpty() {
        return head == z;//retruns the heas node if the head points to the dummy node 
    }
    
    public void display()//displays all items in the linked list 
    {
        Node t = head;
        System.out.print("\nHead -> ");
        while( t != z) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("Z\n");
    }
    
    public static void main(String args[])   
    {
        SortedLL list = new SortedLL();
        list.display();
        
        double x;
        int i, r;
                
        for(i = 1; i <= 5; ++i)  {
           x =  (Math.random()*100.0);
           r = (int) x; 
           System.out.println("Inserting " + r);
           list.insert(r);
           list.display();            
        }
        
        while(!list.isEmpty())  {
            System.out.println("\nInput a value to remove: ");
            Scanner in = new Scanner(System.in);
            r = in.nextInt();
            if(list.remove(r)) {
                System.out.println("\nSuccessfully removed: " + r);
                list.display(); }
            else 
                System.out.println("\nValue not in list");                        
        }
    }
}