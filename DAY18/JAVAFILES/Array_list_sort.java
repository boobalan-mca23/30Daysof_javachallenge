import java.util.*;
public class Array_list_sort {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>();

        list.add("RED");
        list.add("GREEN");
        list.add("ORANGE");
        list.add("WHITE");
        list.add("BLACK");
        System.out.println("original  List :"+" "+list);
        sort(list);


    }
    public static void sort(ArrayList<String>list){
        String value1=" ";
        String value2=" ";

        for(int i=0;i<list.size();i++){





            for(int j=i+1;j<list.size();j++){

                value1=list.get(i);
                value2= list.get(j);
                char chararray1[]=value1.toCharArray();
                char chararray2[]=value2.toCharArray();


                if(chararray1[0]>chararray2[0]){


                    list.set(j,value1);
                    list.set(i,value2);

                }

            }

        }
        System.out.println("Reversed list :"+" "+list);

    }
}