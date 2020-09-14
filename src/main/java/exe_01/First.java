package exe_01;

public class First
{
  public First()
  {

  }

  public void calculate(float digitToConverse){
    System.out.println("Obliczam");
    System.out.printf("binarna: %b", digitToConverse );
    System.out.printf("ósemkowa: %o", digitToConverse );
    System.out.printf("szestnastkowa: %x", digitToConverse );
  }

  public void reverse(float digitToConverse){
    System.out.println("Obliczam");
    System.out.printf("szstnastkowa zmienno przecinek: %a", 1/digitToConverse );

  }
}


