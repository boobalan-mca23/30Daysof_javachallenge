public class Linked_list {
    Node head;
    class Node{
        int value;
        Node next;
        Node( int val){
             value=val;
             next=null;
        }
    }
    Linked_list(){
        head=null;
    }
    public void insertAtBegining(int val){
        Node newnode=new Node(val);

        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtposition(int pos,int val){
        Node newnode=new Node(val);
       pos=pos-1;

       if(pos==0){
           insertAtBegining(val);
           return;
       }
       if(pos==1){
           Node temp=head;
           newnode.next=temp.next;
           temp.next=newnode;
       }
       if(pos>1){
           Node temp=head;
           for(int i=1;i<pos;i++){
               temp=temp.next;
           }
           newnode.next=temp.next;
           temp.next=newnode;
       }
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value +" ");
            temp=temp.next;
        }

    }

}
