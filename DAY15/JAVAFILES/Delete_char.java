import java.util.Scanner;
public class Delete_char {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char array[] = {'a', 'b', 'c', 'd'};
        System.out.print("Before Delete");
        System.out.println();
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter your position");

        int position = sc.nextInt();

        deletechar(array, position);
    }

    public static void deletechar(char arr[], int position) {
        position = position - 1;

        for (int i = 0; i < arr.length; i++) {
            if (position == i) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        System.out.print("After Delete");

        System.out.println();
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
