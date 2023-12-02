public class linkedlist_First_Last {

    public static void main(String args[]){
        Linked_list list =new Linked_list();

        list.insertAtBegining(3);
        list.insertAtBegining(2);
        list.insertAtBegining(1);
        System.out.println("ORIGINAL LINKED LIST :");
        list.display();
        System.out.println();
        System.out.println("INSERT AT  FIRST ");
        list.insertAtBegining(1000);
        list.display();
        System.out.println();
        System.out.println("INSERT AT LAST ");
        list.insertAtLast(3000);
        list.display();



    }
}
