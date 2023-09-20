import java.util.Scanner;
public class Reverssum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        sum(number);
    }
    public static int reverse(int n){
        int value =0;
        while(n!=0){
            int y=n%10;
            value=value*10+y;
            n=n/10;
        }
        return value;
    }
    public static void  sum(int number){
        int res=reverse(number);
        System.out.println("Reverse number: " +res);

        int sumofdigit=0;
        do{
            int y=res%10;
            sumofdigit=sumofdigit+y;
            res=res/10;
        }
        while(res!=0);
        System.out.println("Sum of Digit: "+sumofdigit);
    }
}
