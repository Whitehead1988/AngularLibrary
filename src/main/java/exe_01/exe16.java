package exe_01;

public class exe16
{
  public static double average(double first, double... values){
    double sum =first;
    for(double v: values) sum += v;
    System.out.printf("Srednia to: %f", sum/(values.length+1));
    return values.length == 1 ? first : sum/(values.length+1);
}
}
