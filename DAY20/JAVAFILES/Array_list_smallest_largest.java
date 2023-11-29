import java.util.*;
public class Array_list_smallest_largest {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(123);
        list.add(100);
        list.add(1);
        list.add(43);
        list.add(1000);
        list.add(2);
        System.out.println("THE ORIGINAL ARRAY LIST :" +list);

        ArrayList list_2=sort(list);
        int large=list_2.size()-1;
        System.out.println("THE SMALLEST  ELEMENT IN ARRAY LIST IS "+list_2.get(0));
        System.out.println("THE LARGEST  ELEMENT IN ARRAY LIST IS "+list_2.get(large));
    }
    public static ArrayList sort(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int value_1=list.get(i);
                int value_2=list.get(j);

                if(value_1>value_2){
                    list.set(i,value_2);
                    list.set(j,value_1);
                }
            }
        }
        return list;
    }
}
