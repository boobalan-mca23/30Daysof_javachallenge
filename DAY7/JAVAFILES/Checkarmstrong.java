import java.util.Scanner;
public class Checkarmstrong {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        check(number);
    }
    public static int power(int x,int y){
       int value=1;
        for(int i=0;i<y;i++){
           value=value*x;
        }
        return value;
    }
    public static int digitcount(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
   public static void check(int number){
        int n=number;
        int sum=0;
        int count=digitcount(number);
       while(number!=0) {
           int y = number % 10;
           int res = power(y, count);
          sum=sum+res;
           number=number/10;
       }
       if(sum==n){
           System.out.println("ARMSTRONG NUMBER");
       }
       else{
           System.out.println("NOT A ARMSTROMG NUMBER");
       }
   }
}
