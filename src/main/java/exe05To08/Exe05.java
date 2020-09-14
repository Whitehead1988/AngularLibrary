package exe05To08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exe05
{
  public void readValues(String filename) throws IOException
  {

    File file = new File("C:\\"+ filename);

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    while ((st = br.readLine()) != null)
    {
      System.out.println(st);
    }
  }

  public List<Integer> sumOfValues(String filename) throws IOException
  {

    File file = new File("C:\\"+ filename);

    BufferedReader br = new BufferedReader(new FileReader(file));
    List<Integer> list = new ArrayList<Integer>();
    String st;
    while ((st = br.readLine()) != null)
    {
      list.add(Integer.parseInt("2"));
      list.add(Integer.parseInt("3"));
    }


    return list;
  }

}

