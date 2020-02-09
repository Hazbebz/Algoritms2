// StackTest.java
// Linked list implementation of Stack
class StackException extends Exception { 
    public StackException(String s) {
        super(s);
    }
}
//structure- data and poinnter to next variable
class Stack {
    
    class Node {
        int data;//data item
        Node next;//pointer   
    }
    private Node top;//pointre to point to the top of the stack 
      
    public Stack()
    { 
        top = null;
    }
    
	//push function to put new node onto the stack
    public void push(int x) {
        Node  t = new Node();//calls the creation for a new node 
        t.data = x;//assigns data to data field of node
        t.next = top;//assigns what is currently top pointer to be the next pointer
        top = t;//new node is now the top node 
    }

    // pop() method here
    // only to be called if list is non-empty.
    // Otherwise an exception should be thrown.
    public int pop() throws StackException
    {
        if(this.isEmpty()) // if the stack is empty-true/false 
            throw new StackException("\nIllegal to pop() an empty Stack\n");//exception if the stack is empty
        
        int x = top.data;//assign the value to be popper
        top = top.next;//assign the nodes pointer
        return x;//return popped value         
    }
	
	public boolean isEmpty(){
       return top == null;
    }
	
	public int size() {
        int c = 0;
        Node t = top;
        while(t != null) {
            ++c;
            t = t.next;
        }
        return c;        
    }

    public void display() {
        Node t = top;
        //Console.Write("\nStack contents are:  ");
        System.out.println("\nStack contents are:  ");
        
        while (t != null) {
            //Console.Write("{0} ", t.data);
            System.out.print(t.data + " ");
            t = t.next;
        }
        //Console.Write("\n");
        System.out.println("\n");
    }

}


public class StackTest
{
    public static void main( String[] arg){
        Stack s = new Stack();
        //Console.Write("Stack is created\n");
        System.out.println("Stack is created\n");
        
        s.push(10); s.push(3); s.push(11); s.push(7);
        s.display();
        
        //int i = s.pop();
        
        //Console.Write("\nJust popped {0}", i);
        //System.out.println("Just popped " + i);
        //s.display();
    }
}

