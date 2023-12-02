public class Linked_remove {
    public static void main(String args[]){
        Linked_list list =new Linked_list();
        list.insertAtBegining(6);
        list.insertAtBegining(5);
        list.insertAtBegining(4);
        list.insertAtBegining(3);
        list.insertAtBegining(2);
        list.insertAtBegining(1);
        System.out.println("ORIGINAL LINKED LIST :");
        list.display();
        System.out.println();
        System.out.println("REMOVE 1 POSITION ");
        list.remove(1);
        list.display();
        System.out.println();
        System.out.println("REMOVE 3 POSITION ");
        list.remove(3);
        list.display();
        System.out.println();
        System.out.println("REMOVE LAST POSITION ");
        list.remove(4);
        list.display();



    }
}
