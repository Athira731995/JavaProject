import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sample {



    public int add(int x,int y){
        return x+y;
    }

    public String show(){
        System.out.println("hello");
        return "s";
    }
    public static void main(String[] args) {


        Queue<String> s=new PriorityQueue<String>();
        s.add("djffj");
        s.add("fff");
        s.add("abc");
        s.add("ccc");
        s.add("dff");
//       s.add(null);
        for (String o:s){

            System.out.println(o);
        }
        System.out.println("head "+s.peek());//return null if no element present
        System.out.println("head "+s.element());
   //     System.out.println(s.remove());
     //   System.out.println(s.poll());
        ArrayDeque<String>s11;
        s11 = new ArrayDeque<String>();
        s11.addFirst("abc");
        s11.addLast("addd");
        s11.add("ddd");
        s11.pollFirst();



    }
}
