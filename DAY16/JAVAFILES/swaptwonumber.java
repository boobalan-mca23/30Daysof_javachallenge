import java.util.Scanner;
public class swaptwonumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int number_1=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int number_2=sc.nextInt();

        swapwithouttemp(number_1,number_2);
    }
    public static void swapwithouttemp(int n1,int n2){
        int a=n1;
        int b=n2;
        System.out.println("before swap a is " +" "+a);
        System.out.println("before swap b is " +" "+b);
        b=b-a;
        a=a+b;
        System.out.println("After swap a is " +" "+a);
        System.out.println("After swap b is " +" "+b);

    }
}
