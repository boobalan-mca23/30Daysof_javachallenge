import java.util.*;
public class Array_list_largest {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(100);
        list.add(1);
        list.add(43);
        list.add(1000);
        list.add(2);
        System.out.println("ORIGINAL ARRAY LIST :" +list);
       ArrayList list_2=sort(list);

       System.out.println("THE LARGEST ELEMENT IN THE ARRAY LIST IS :"+ list_2.get(0) );
    }
    public static ArrayList sort(ArrayList<Integer>list){

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
               int value_1=list.get(i);
               int value_2=list.get(j);

               if(value_1<value_2){
                   list.set(i,value_2);
                   list.set(j,value_1);
               }
            }
        }
        return list;
    }
}
