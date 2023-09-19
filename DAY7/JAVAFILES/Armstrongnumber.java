import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the first range");
       int n=sc.nextInt();
        System.out.println("Enter the second range");
       int m=sc.nextInt();
       range(n,m);


    }
    public static void range(int n,int m){
        for(int i=n;i<m;i++){
            boolean flag=check(i);
            if(flag==true){
                System.out.print(i+" ");
            }
        }
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
    public static boolean check(int number){
        boolean flag=true;
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
            flag=true;
        }
        else{
           flag=false;
        }
        return flag;
    }

}
