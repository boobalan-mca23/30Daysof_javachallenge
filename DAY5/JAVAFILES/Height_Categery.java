import java.util.Scanner;
public class Height_Categery {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height");
        int height=sc.nextInt();
        findheight(height);
    }
    static void  findheight(int height){
        if(height>170){
            System.out.println("the person is tall.");
        }
        else if(height>=150 && height<=170){
            System.out.println("the person has averge height.");
        }
        else{
            System.out.println(" the person is  dwarf.");
        }
    }
}
