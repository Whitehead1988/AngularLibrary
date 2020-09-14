package exe02;

import com.sun.javafx.scene.control.skin.VirtualFlow;


public class Exe16
{
  class Node{
    public boolean isFirst;
    public boolean isEnd;
    public Node next;
    public Node previous;

    public Node(Node next, Node previous){
        this.next = next;
        this.previous = previous;
    }

    public Node next(){
      if (isEnd)
      {
        return null;
      }
      else
      {
        return next;
      }
    }

    public Node previous()
    {
      if (isFirst)
      {
        return null;
      }
      else
      {
        return previous;
      }
    }
  }

  private static String[] stringsQueue = {};
  private static int id=-1;

  public static void add(String stringToadd){
    ++id;
    String[] temp = new String[id+1];

    for(int i=0; i<id; i++){
      temp[i] = stringsQueue[i];
    }
    temp[id] = stringToadd;
    stringsQueue= temp;
    printAll();
  }

  public static void remove(){
    
    String[] temp = new String[id];
    for(int i=0; i<id; i++){
      temp[i] = stringsQueue[i+1];
    }
    stringsQueue= temp;
    id--;
    printAll();
  }

  private static void printAll(){
    for(int i=0; i<stringsQueue.length; i++){
      System.out.println("Element to : " + stringsQueue[i]);
    }
  }
}
