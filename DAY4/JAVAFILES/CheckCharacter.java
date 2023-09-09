import java.util.Scanner;
public class CheckCharacter {
   public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a character you want to check");
         char character=sc.next().charAt(0);
        check(character);
   }
   static void check(char character){
      if(character=='a' || character=='e'||character=='i'||character=='o'||character=='u'){
         System.out.println("its a Vowel");
      }
      else if(character>='0' && character<='9'){
         System.out.println("its a Digit");
      }
      else{
         System.out.println("its a Consonant");
      }
   }
}
