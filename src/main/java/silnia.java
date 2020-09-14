public class silnia
{
  public void oblicz(int n){
    int wynik =1;
    for(int i=1;i<=n;i++){
      wynik = wynik * (i);
    }

    System.out.println("Wynik to: "+wynik);
  }

  public int obliczRek(int n){

    if(n==1){
      return 1;
    }else{
      return n*obliczRek(n-1);
    }

//    System.out.println("Wynik to: "+wynik);
  }

  public String palindrome(int n){

   
  }
}
