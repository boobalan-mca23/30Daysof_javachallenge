public class Uppertriangle_pattern {
    public static void main(String args[]){

        int space=10;
        int star=1;
        int i=1;
        int j=1;
        while(star<=10){
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i=1;
            space--;
        while(j<=star){
            System.out.print("*");
            j++;
        }
            System.out.println();

        j=1;
        star++;

        }
    }
}
