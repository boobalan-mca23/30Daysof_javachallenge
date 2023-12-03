public class Linked_List_GetFirst_GetLast {
    public static void main(String args[]){
        Linked_list list=new Linked_list();
        System.out.println("ORIGINAL LINKED LIST :");
        list.insertAtBegining(6);
        list.insertAtBegining(5);
        list.insertAtBegining(4);
        list.insertAtBegining(3);
        list.insertAtBegining(2);
        list.insertAtBegining(1);
        list.display();
        System.out.println();
        System.out.println("FIRST ELEMENT IN LINKED LIST");
        list.getFirst();
        System.out.println();
        System.out.println("LAST ELEMENT IN LINKED LIST");
         list.geLast();


    }
}
