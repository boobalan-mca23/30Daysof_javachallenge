import java.util.Scanner;
public class GradeandDisplay {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter grade of the student:");
        char grade=sc.next().charAt(0);
        System.out.println(grade);
          if(grade=='A' || grade=='a'){
              System.out.println("Student has got marks between above 80 out of 100");
          }
        else if(grade=='B' || grade=='b'){
            System.out.println("Student has got marks above 60 but less than equal to 80 out of 100.");
        }
          else if(grade=='C' || grade=='c'){
              System.out.println("Student has got marks above 40 but less than equal to 60 out of 100.");
          }
          else{
              System.out.println("Student has failed");
          }

    }
}
