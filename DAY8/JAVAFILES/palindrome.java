import java.util.Scanner;
public class palindrome {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        checkpalindrome(number);
    }
    public static int reverse(int n){
        int res=0;
        while(n!=0){
            int y=n%10;
            res=res*10+y;
            n=n/10;
        }
        return  res;
    }
    public static void checkpalindrome(int number){
        int n=number;
        int res=reverse(number);
        if(res==n){
            System.out.println(res+" is Palindrome");
        }
        else{
            System.out.println(res +" is Not a Palindrome");
        }
    }
}
