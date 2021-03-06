// QueueTest.java
// Allocation of Queue objects in main()

class QueueTest {

    private class Node {
        int data;
        Node next;
    }

    Node z;
    Node head;
    Node tail;

    public QueueTest() {
        z = new Node(); z.next = z;
        head = z;  tail = null;
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


  public void enQueue( int x) {
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
  
  public int size(){
    Node temp = head;
    int Size = 0;
    while(temp !=temp.next){
      temp = temp.next;
      Size += 1;
    }
    return Size;
  }
} // end of Queue class



class Queue {
  
  // try out the ADT Queue using static allocation
  public static void main(String[] arg) {

    QueueTest q = new QueueTest();

    System.out.println("Inserting ints from 9 to 1 into queue gives:\n");
    for (int i = 9; i > 0; --i) {
       q.enQueue( i);
    }
    
    q.display();
    
    if( ! q.isEmpty())
        System.out.println("Deleting value from queue " + q.deQueue() + "\n");

    System.out.println("Adding value to queue " + 27 + "\n");
    q.enQueue(27);
    q.display();
    System.out.println("This is size of the queue is "+ q.size());

  }

} //end of Test class
