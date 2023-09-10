import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alphabet=sc.next().charAt(0);
        check(alphabet);
    }
    static void check(char alphabet){
        if(alphabet >= 'A' && alphabet<='Z'){
            System.out.println("its a UPPERCASE");
        }
        else if(alphabet >= 'a' && alphabet<='z'){
            System.out.println("its a LOWERCASE");
        }
        else if(alphabet>='0' && alphabet<='9'){
            System.out.println("its a DIGIT");
        }
    }
}

