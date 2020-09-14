package ece03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exe07
{
  public static void luckySort(String[] strings){
    Arrays.sort(strings, (s1, s2) -> (s1.length() - s2.length()));

    for(int i=0;i<strings.length;i++){
      System.out.println(strings[i]);
    }

  }
}
