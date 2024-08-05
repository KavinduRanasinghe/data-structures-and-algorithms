public class Node{
    public int iData;
    public Node next;

    public Node(int data){
        iData = data;
        next=null;

    }

    public void displayNode(){
        System.out.println("{"+iData+"}");
    }

}