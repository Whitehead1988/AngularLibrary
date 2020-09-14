package ece03;

public class Exe13
{


  public Runnable test(Runnable[] list){
    return () -> {for(int i=0; i<list.length;i++){list[i].run(); }
    };
  }
}
