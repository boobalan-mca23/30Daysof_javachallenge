import java.util.*;
public class Array_list_remove {
    public static void main (String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("Original Array list :");
        System.out.println(list);
        int index= list.size()-4;
        int size= list.size();

        for(int i=index;i<size;i++){

            list.remove(index);
        }
        System.out.println("After removed last four elements in Array list :");
        System.out.println(list);

    }
}
