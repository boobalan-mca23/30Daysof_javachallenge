import java.util.*;
public class TreesetReverse {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        System.out.println("original treeset values ");
        Iterator i=ts.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("Reversed treeset values");
        Iterator i2=ts.descendingIterator();
        while(i2.hasNext()){
            System.out.print(i2.next()+" ");
        }
    }
}
