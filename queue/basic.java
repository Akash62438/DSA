import java.util.*;

class basic {
    // Display the queue elements
    static void display(Queue<Integer> q) {
        int s = q.size();
        for (int i = 0; i < s; i++) { // Loop from 0 to size - 1
            int x = q.peek(); // Get the front element
            System.out.print(x + " ");
            q.remove(); // Remove the front element
            q.add(x); // Add it back to the rear
        }
        System.out.println(); // Newline after displaying
    }

    // Reverse the queue
    static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        // Push all elements of the queue into a stack
        while (q.size()>0) {
            st.push(q.remove());
        }
        
        while (st.size()>0) {
           int x = st.pop();
           System.out.print(x+" ");
           q.add(x);
        }
         System.out.println("");
        
    }
     
    static void even(Queue<Integer> q) {
       Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
       for(int i = 0 ; i < n ; i++){
           if(i%2==0){
               int x = q.remove();
               q2.add(x);
               
           }
           else{
               q.remove();
           }
           
           
       }
       System.out.print("");
       display(q2);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        // Display the queue
        System.out.print("Original Queue: ");
        display(q);

     
        
      System.out.print("");
      
        even(q);
    }
}
