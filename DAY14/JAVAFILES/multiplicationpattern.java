
public class multiplicationpattern {
    public static void main(String args[]){
        for(int j=1;j<=10;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       pattern();
    }
    public static void pattern(){
        int count=1;
        int i=1;
        int chance=1;
        int number=1;
        while(count<=10){
            while(i<=chance){
                System.out.print(number*i+" ");
                i++;
            }
            System.out.println();
            i=1;
            count++;
            chance++;
            number++;
        }
    }
}
