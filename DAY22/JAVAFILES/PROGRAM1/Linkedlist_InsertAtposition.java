public class Linkedlist_InsertAtposition {
    public static void main(String args[]){
        Linked_list list=new Linked_list();
        System.out.println("ORIGINAL LINKED LIST :");
        list.insertAtBegining(9);

        list.insertAtBegining(10);

        list.insertAtBegining(11);

        list.insertAtBegining(12);
        list.display();
        System.out.println();
        System.out.println("LINKED LIST INSERTAT POSITION AT 1...");
        list.insertAtposition(1,1000);
        list.display();
        System.out.println();
        System.out.println("LINKED LIST INSERTAT POSITION AT 2...");
        list.insertAtposition(2,3000);
        list.display();
        System.out.println();
        System.out.println("LINKED LIST INSERTAT POSITION AT 5...");
        list.insertAtposition(5,2000);
        list.display();
    }
}
