import java.util.Scanner;
public class vowel_consonant_count {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        input=input.toLowerCase();
        System.out.println("Input String is "+" "+input);
        char char_array[]=input.toCharArray();
        count_vowel_consonant(char_array);
    }
    public static void count_vowel_consonant(char []input){
        int vowel_count=0;
        int consonant_count=0;

        for(int i=0;i<input.length;i++){

            if((input[i]=='a') || (input[i]=='e') ||(input[i]=='i') || (input[i]=='o') || (input[i]=='u') ){
                vowel_count++;
            }
            else{
                consonant_count++;
            }
        }
        System.out.println("the count of vowel is"+" "+vowel_count);
        System.out.println("the count of consonant is"+" "+consonant_count);
    }
}
