
import java.util.*;
public class Array_list_compare {
    public static void main(String args[]){
        ArrayList list_1=new ArrayList<>();

        ArrayList list_2=new ArrayList<>();

        ArrayList newlist=new ArrayList<>();

        System.out.println(" COMPARED FIRST ARRAY TO SECOND ARRAY :");
        //list1 values
        list_1.add("RED");
        list_1.add("GREEN");
        list_1.add("BLACK");
        list_1.add("WHITE");
        list_1.add("PINK");
        System.out.println("FIRTS ARRAY : " + list_1);
        //list 2 values
        list_2.add("RED");
        list_2.add("GREEN");
        list_2.add("BLACK");
        list_2.add("PINK");
        System.out.println("SECOND ARRAY :" + list_2);
         compare(list_1,list_2,newlist);

    }
    public static void compare(ArrayList<String>list_1,ArrayList<String>list_2,ArrayList<String>newlist){
        boolean bool=false;
        for(int i=0;i<list_1.size();i++){//outer loop
            String value_1=list_1.get(i);

            for(int j=0;j<list_2.size();j++){//inner loop
                String value_2=list_2.get(j);

                if(value_1==value_2){// condition
                    newlist.add("YES");
                    bool=true;

                }
            }
            if(bool==false){

                newlist.add("NO");
            }
            bool=false;
        }

System.out.println(" RESULT : " + newlist);

    }
}
