public class Outer
{
  private inｔ outProp = 9;
  class Inner
  {
    private int inProp = 5;
    public void accessOuterProp()
    {
      System.out.println("Outer Class Prop:" + outProp);
    }
  }
  public void accessInnerProp()
  {
    System.out.println("Inner Class Prop: " ＋　ｎｅｗ　Iｎｎｅｒ（）.inProp);
  }
  public static void main(String[] args)
  {
    Outer out = new Outer();
    out.accessInnerProp();
  }
}
