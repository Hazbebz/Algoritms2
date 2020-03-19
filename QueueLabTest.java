// Lab Test on Queue

class Queue {

    private class Node {
        int data;
        Node next;
    }
    
    Node z;
    Node head; 
    Node tail;

    public Queue() {
        z = new Node(); z.next = z;
        head = z;  tail = null;
    }
    

    public void enQueue(int x){
        Node temp;

        temp = new Node();
        temp.data = x;
        temp.next = z;

        if(head == z)    // case of empty list
            head = temp;
        else                // case of list not empty
            tail.next = temp;

        tail = temp;        // new node is now at the tail
    }
    
    // assume the queue is non-empty when this method is called
    public int deQueue() {
        int x = head.data;
        head = head.next;
        if (head == head.next)
            tail = null;
    
        return x;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public int count (char x) 
    {
        
        int count = 0;
        while(head != z)//while list is not empty
        {
            if(head.data==x)//check for x in head.data
                count++;//increment count if present
            else
                head=head.next;//else move to next node
        }
        return count;//return count after loop completetion	  
    }

      
    public boolean remove(char x){
            while(head.data != x){//while the node does not contain x
                return false;
            }
            return true;

    }

    
    public void display() {
        System.out.println("\nThe queue values are:\n");

        Node temp = head;
        while( temp != temp.next) {
            System.out.print( temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

} // end of Queue class



class QueueLabTest {
  
  // try out the ADT Queue using static allocation
  public static void main(String[] arg) {

    Queue q = new Queue();

    System.out.println("Inserting ints from 9 to 1 into queue gives:\n");
    for (int i = 1; i < 10; ++i) {
       q.enQueue( (char) (i+64));
    }
    q.enQueue('A'); q.enQueue('B');
    q.display();

    
    
    System.out.println("Deleting value from queue " + q.deQueue() + "\n");
    q.display();
    
    System.out.println("Count of value B in queue is " + q.count('B') + " \n");
    System.out.println("Removing charachter equiv of "+q.remove('B')+"\n");
    q.remove('B');
    q.display();

  }

} //end of Test class

