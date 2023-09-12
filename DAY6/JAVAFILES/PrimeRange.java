import java.util.Scanner;
public class PrimeRange {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first range ");
        int first=sc.nextInt();
        System.out.println("Enter the second range ");

        int second=sc.nextInt();
        range(first,second);

    }
   static void range(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            boolean output=primecheck(i);
            if(output==true){
                System.out.print(i+" ");
            }

        }
   }
   static boolean primecheck(int number){
        boolean flag=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }
        return flag;
   }
}

