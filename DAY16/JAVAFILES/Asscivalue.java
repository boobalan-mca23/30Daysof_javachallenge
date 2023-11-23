import java.util.Scanner;
import java.lang.String;
public class Asscivalue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String character=sc.next();
         char chararray[]=character.toCharArray();
       asciivalue(chararray);
    }
    public static void asciivalue(char []arr){
        for(int i=0;i<arr.length;i++){
            int ascii=arr[i];
            System.out.println("The Ascii value of "+arr[i]   + " is : "+ascii);
        }
    }

}
