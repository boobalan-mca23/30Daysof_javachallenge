import java.util.Scanner;
public class Primenumber {
    static int number;
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number");
     number=sc.nextInt();
     boolean output=checkprime(number);
     if(output==true){
         System.out.println( number+ "   its prime number");
     }
     else{
         System.out.println(number+  "   its not prime number");
     }
}
static boolean checkprime(int number){
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
