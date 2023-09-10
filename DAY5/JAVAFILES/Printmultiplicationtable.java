import java.util.Scanner;
public class Printmultiplicationtable {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the number");
        int number=sc.nextInt();
        Multiplicationtable(number);
    }
    static void  Multiplicationtable(int number ){

        for(int i=1;i<=10;i++){
            int value=number*i;
            System.out.println(number +" * " +i+ " = "+" "+value);
        }
    }
}
