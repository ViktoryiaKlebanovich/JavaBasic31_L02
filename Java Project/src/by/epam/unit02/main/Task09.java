package by.epam.unit02.main;

public class Task09 {
  public static void main(String[] args) {
    double x, Fx=0;
    x = -9;
    if (x <= -3) {
      Fx = 9;
    } else if (x > 3) {
      Fx = 1 / ((Math.pow(x, 2) + 1));
    }
    System.out.println("Fx= " + Fx);
  }
}
