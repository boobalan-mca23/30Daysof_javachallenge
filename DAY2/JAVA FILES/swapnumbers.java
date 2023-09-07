import java.util.Scanner;
public class swapnumbers {
    static int number1,number2=0;
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
        number1=sc.nextInt();
        System.out.println("Enter The Second Number");
        number2=sc.nextInt();
        swap(number1,number2);
    }
    static void swap(int n1,int n2){//without using temp variable
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After Swapping:");
        System.out.println("The First Number :"+" " +n1);
        System.out.println("The Second Number :"+" " +n2);

    }





}
