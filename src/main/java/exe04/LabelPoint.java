package exe04;

public class LabelPoint extends Point
{
  private String label;

  public LabelPoint(String label, double x, double y)
  {
    super(x, y);
    this.label = label;
  }

  public  String getLabel(){
    return label;
  }
}
