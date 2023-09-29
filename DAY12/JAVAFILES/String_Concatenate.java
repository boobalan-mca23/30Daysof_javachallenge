import java.util.Scanner;
public class String_Concatenate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=sc.nextLine();
        System.out.println("Enter the second string");
        String str2=sc.nextLine();
        String res=stringconcat(str1,str2);
        System.out.println("new String is"+" "+res);

    }
    public static String stringconcat(String str1,String str2){
        String str3=str1+" "+str2;
        return str3;
    }
}
