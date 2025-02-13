
import java.util.*;
class QueueByStacks {
   private Stack<Integer> stack1 = new Stack<>();
   private Stack<Integer> stack2 = new Stack<>();
   public void enqueue(int x) {
       stack1.push(x);
   }
   public int dequeue() {
       if (stack2.isEmpty()) {
           while (!stack1.isEmpty()) {
               stack2.push(stack1.pop());
           }
       }
       return stack2.isEmpty() ? -1 : stack2.pop();
   }
   public static void main(String[] args) {
       QueueByStacks q = new QueueByStacks();
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       System.out.println(q.dequeue());
       System.out.println(q.dequeue());
   }
}

