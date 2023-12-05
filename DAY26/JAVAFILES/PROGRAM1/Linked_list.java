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
    public void add(int val){
        Node newnode=new Node(val);

        if(head==null){
            head=newnode;
        }
        else{
           int length=length();


           Node temp=head;
           for(int i=1;i<=length;i++){
               if(temp.next==null){
                   temp.next=newnode;
               }
               else{
                   temp=temp.next;
               }

           }
        }
    }
    public int get(int pos){
        int value=0;
        pos=pos-1;

        if(pos==0){
            Node temp=head;
            value=temp.value;

        }
        if(pos>=1){
            Node temp=head;
            for(int i=1;i<=pos;i++){
                temp=temp.next;
            }
            value=temp.value;
        }
        return value;
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
    public void removeFirst(){
        Node checknode=head;

        if(checknode.next==null){
            head=null;
            return;
        }
        if(head.next!=null){
            Node temp=head;
            Node Nextnode=temp.next;
            temp.next=null;
            head=Nextnode;
        }

    }
    public void removeLast(){
        Node checknode=head;

        if(checknode.next==null){
            head=null;
            return;
        }
        if(head.next!=null){
            int length=length();
            length=length-1;
            Node temp =head;
            for(int i=1;i<length;i++){
                temp=temp.next;
            }
            temp.next=null;
        }

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
    public void swap(int pos_1,int pos_2) {
        pos_1 = pos_1 - 1;
        pos_2 = pos_2 - 1;

        Node NextNode_1;
        Node NextNode_2;

        int value_1 = 0;
        int value_2 = 0;



        NextNode_1=head;

        for(int i=0;i<pos_1;i++){
            if(pos_1==0){
                Node temp=head;
                value_1= temp.value;
                break;
            }
            NextNode_1=NextNode_1.next;
        }

        NextNode_2=head;

        for(int i=0;i<pos_2;i++){
            NextNode_2=NextNode_2.next;
        }
        value_1=NextNode_1.value;
        value_2= NextNode_2.value;



        int tempvalue=value_1;
        value_1=value_2;
        value_2=tempvalue;

        NextNode_1.value=value_1;
        NextNode_2.value=value_2;
    }

}
