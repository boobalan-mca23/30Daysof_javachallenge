public class floydpattern {
    public static void main(String args[]){
        int count=1;
        int number=1;
        int i=1;

        while(count<=4){
            while(number<=count){
                System.out.print(i+" ");
                number++;
                i++;
            }
            System.out.println();
            count++;
            number=1;

        }
    }
}
