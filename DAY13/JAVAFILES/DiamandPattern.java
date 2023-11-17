public class DiamandPattern {
    public static void main(String args[]) {
        int j = 1;
        int z=1;
        int space_1 = 15;
        int count_1 = 1;
        int count_2 = 13;
        int space_2 = 3;

        while (count_1<=15) {
            while (j<=space_1){
                System.out.print(" ");
                j++;
            }
            for(int i=1;i<=count_1;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
            space_1=space_1-2;
            count_1=count_1+2;
            j=1;
        }
        while (count_2>=1) {
            while (z<=space_2){
                System.out.print(" ");
                z++;
            }
            for(int i=1;i<=count_2;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
            space_2=space_2+2;
            count_2=count_2-2;
            z=1;
        }
    }
}
