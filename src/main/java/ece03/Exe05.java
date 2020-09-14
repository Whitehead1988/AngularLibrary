package ece03;

import java.util.function.IntConsumer;

public class Exe05
{
  public Exe05(){

  }

  public static void constant(int number, IntConsumer action ){
    while(true){
      action.accept(number);

    }
  }

  public static void constant(int number, Runnable action ){
    while(true){
      action.run();

    }
  }


}
