public class LinkedList_SetIterate {
    public static void main(String args[]){
        Linked_list list=new Linked_list();


        list.insertAtBegining(6);
        list.insertAtBegining(5);
        list.insertAtBegining(4);
        list.insertAtBegining(3);
        list.insertAtBegining(2);
        list.insertAtBegining(1);

        System.out.println();
        System.out.println("ORIGINAL LINKED LIST");
        list.display();
        System.out.println();

        System.out.println("ITERATE 1 POSITION");
        list.setIterate(1);
        System.out.println();

        System.out.println("ORIGINAL LINKED LIST");
        list.display();
        System.out.println();

        System.out.println("ITERATE 3 POSTION TO LAST");
        list.setIterate(3);
        System.out.println();

        System.out.println("ORIGINAL LINKED LIST");
        list.display();
        System.out.println();

        System.out.println("ITERATE 4 POSTION TO LAST");
        list.setIterate(4);



    }
}
