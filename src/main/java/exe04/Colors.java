package exe04;

public enum Colors
{
  BLACK("czarny"),
  RED(""),
  BLUE(""),
  GREEN("");

  private String namePol;
  Colors (String namePol){
    this.namePol=namePol;
  }


  public String getRed(){
    return RED.name();
  }
}
