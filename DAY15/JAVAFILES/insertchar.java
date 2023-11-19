import java.util.Scanner;
public class insertchar {
    public static void main (String args[]){

        char chararray []={'a','b','c','d'};
        System.out.print("Before inserting");
        System.out.println();
        for(int i=0;i<chararray.length;i++){
            System.out.print(chararray[i]);
        }
        System.out.println();
        char insert_char='x';
        int position=3;
        insert(chararray,insert_char,position);
    }
    public static void insert(char arr[],char insert_char,int position){

        position=position-1;
        char newarray[]=new char[arr.length+1];
        for(int i=0;i<position;i++){
            newarray[i]=arr[i];
        }
        newarray[position]=insert_char;

        for(int j=position+1;j<newarray.length;j++){
            newarray[j]=arr[j-1];
        }
        System.out.print("After inserting");
        System.out.println();
        for(int k=0;k<newarray.length;k++){
            System.out.print(newarray[k]);
        }
    }



}
