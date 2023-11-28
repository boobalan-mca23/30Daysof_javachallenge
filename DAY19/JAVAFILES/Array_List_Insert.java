import java.lang.reflect.Array;
import java.util.*;
public class Array_List_Insert {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       System.out.println("Original Array list : " +list);
       list.add(0,400);
        list.add(0,300);
        list.add(0,200);
        list.add(0,100);

        System.out.println("Insert new values in front of Array List : " +list);

    }
}
