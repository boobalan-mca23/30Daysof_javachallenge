import java .util.Scanner;
public class Equalornot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter Second number");
        int n2=sc.nextInt();
        equal(n1,n2);

    }
    static void equal(int n1,int n2){
        if(n1==n2){
            System.out.println("the two numbers are equal");
        }
        else{
            System.out.println("the two numbers are not equal");
        }
    }
}
