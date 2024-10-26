
import java.util.*;
class arrayimp {
    public static class stack{
  
    int arr[]= new int [2];
     int ind = 0;
     // push function 
     
     void push( int x){
          if (isfull()) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
          }
          arr[ind]=x;
          ind++;
    
         
     }
     
     // pop function
     
     int peek (){
         if (ind==0) {
            System.out.println("Stack is empty");
            return -1;
        }
      
        return arr[ind-1];
     }
     
     // push function
     
     int pop(){
          if (ind==0) {
            System.out.println("Stack Underflow! Cannot pop an element");
            return -1;
        }
        int top = arr[ind-1];
       // arr[ind-1]==0;
        ind--;
         return top;
       
     }
     void display(){
         for(int i=0 ; i<ind ; i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
     
     boolean isempty(){
         if(ind==0) return true;
         else return false;
     }
     boolean isfull(){
         if (ind==arr.length) return true;
         else return false;
     }
     
    }
    public static void main(String[] args) {
              stack stack = new stack();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    stack.display();
                    break;

                case 2:
                    stack.pop();
                  stack.display();
                    break;

                case 3:
                    stack.peek();
                 stack.display();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}