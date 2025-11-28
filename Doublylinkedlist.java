class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.prev=prev;
        this.data=data;
        this.next=null;
    }
}
class DoublylinkedlistMethods{
    private Node head=null;
    private Node tail=null;
    public void addEnd(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
     public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void forwardtraverse(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        System.out.println("Forward:");
        while(temp!=null){
            System.out.println(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     public void backwardtraverse(){
        if(tail==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=tail;
        System.out.println("backward:");
        while(temp!=null){
             System.out.println(temp.data+"<->");
            temp=temp.prev;
        }
      System.out.println("null");
 }
 public void deleteEndOne(){
    if(tail==null){
        System.out.println("no data");
        return;
    }
    tail=tail.prev;
    if(tail!=null){
        tail.next=null;
    }else{
        head=null;
    }

 }
 public void deleteFirst(){
    if(head==null){
        System.out.println("no data");
        return;
    }
    head=head.next;
    if(head!=null){
        head.prev=null;
    }else{
        tail=null;
    }

}
}
public class Doublylinkedlist {
    public static void main(String[] args) {
         DoublylinkedlistMethods a=new  DoublylinkedlistMethods();
         a.addFirst(10);
         a.addFirst(20);
         a.addFirst(30);
         a.addFirst(40);
         a.forwardtraverse(); 
         a.backwardtraverse();
         a. deleteEndOne();
         a.deleteFirst();

    }
    
}
