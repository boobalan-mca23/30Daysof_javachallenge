import java.util.Scanner;
public class Reversenumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        int res=0;
        while(n!=0){
            int y=n%10;
            res=res*10+y;
            n=n/10;
        }
        System.out.print(res);
    }
}
