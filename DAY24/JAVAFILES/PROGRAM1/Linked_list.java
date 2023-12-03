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
        if(head==null){
            System.out.println("THE LINKED LIST  IS EMPTY");
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value +" ");
            temp=temp.next;
        }

    }
    public void getFirst(){
        Node temp=head;
        System.out.print(temp.value);
    }
    public void geLast(){
        int length=length();

        length=length-1;

        Node temp=head;
        for(int i=1;i<length;i++){
            temp=temp.next;
        }
        Node NextNode=temp.next;
        System.out.print(NextNode.value);
    }
    public void getIndexValue(){
        int index=0;
        Node temp=head;
        while(temp!=null){
            System.out.println("Element at index " +index +":" +" "+temp.value);
            index++;
            temp=temp.next;

        }
    }
    public void remove(int pos){
        pos=pos-1;

        if(pos==0){
            Node temp=head;
            Node Nextnode=temp.next;
            head=Nextnode;
        }
        else{
            Node temp=head;

            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            Node Nextnode=temp.next;
            temp.next=Nextnode.next;
            Nextnode.next=null;
        }
    }
    public void reverse(){
        Node pre=null;
        Node current=head;

        while(current!=null){
            Node next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        head=pre;
    }
    public void removeall(){
        head=null;
    }
    public void insertAtLast(int val){
        Node newnode=new Node(val);

        int length=length();
        Node temp=head;
        for(int i=1;i<length;i++){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public int length(){
        Node temp=head;
        int length=0;
        while(temp!=null){

            temp=temp.next;
            length++;
        }
        return length;
    }
    public void setIterate(int pos){
       pos=pos-1;
       if(pos==0){
           Node temp=head;
           System.out.print(temp.value);
       }
       if(pos>1){
           Node temp=head;
          for(int i=1;i<pos;i++){
              temp=temp.next;
          }
          Node Nextnode=temp.next;

           while(Nextnode!=null){
               System.out.print(Nextnode.value+" ");
               Nextnode=Nextnode.next;
           }
       }
    }

}
