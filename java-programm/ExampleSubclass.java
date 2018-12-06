

public class ExampleSubclass extends Example {

  {
    step(9);
  }

  public static int step_3 = step(3);
  public int step_10 = step(10);

  static {
    step(4);
  }

  public ExampleSubclass() {
    step(11);
  }

  public static void main(String[] args) {
    step(5);
    new ExampleSubclass();
    step(12);
  }
}