import java.util.EmptyStackException;
import java.util.Scanner;


// StackTest.java
// Linked list implementation of Stack

class Stack {
    
    class Node {//node class 
        int data;
        Node next;  
    }
    private Node top;
      
    public Stack()
    { 
        top = null;
    }
        
    public void push(int x) {
        Node  t = new Node();//creates a new node
        t.data = x;//adds data to node t
        t.next = top;//new node pushed onto stack is the top node 
        top = t;
    }

    // pop() method here
    // only to be called if list is non-empty.
    // Otherwise an exception should be thrown.
    public int pop(){
        if (top == null){//if statement for an empty stack 
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int data = top.data;
            top = top.next;

            return data;
        }
    }//end pop()   

    public int size(){
        int size = 0;
        while (top != null){
            top = top.next;
            size += 1;
        }
        return size;
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
    }//end display()
    
    /*
    public boolean isMember(int x){
        
        Node t = top;
        while(t!= null){
            t = t.next;
            if(x == t.data){
                return true;
            }
            else
                return false;
        }
    }
    */
}



public class StackTest
{
    public static void main( String[] arg){
        Stack s = new Stack();
        //Console.Write("Stack is created\n");
        System.out.println("Stack is created\n");
        
        s.push(10); s.push(3); s.push(11); s.push(7);
        s.display(); 
        
        int i = s.pop();
        int j = s.size();
        s.isMember(10);
        
        //Console.Write("\nJust popped {0}", i);
        System.out.println("Just popped " + i);
        System.out.println("Stack size is " + j);
        System.out.println("is Member result "+ x);
        //s.display();
    }
}
