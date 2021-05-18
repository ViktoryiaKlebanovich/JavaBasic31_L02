package by.epam.unit02.main;

public class Task02 {
  public static void main(String[] args) {
    int x = 12;
    int y = 13;
    int z;
    if (x > y) {
      System.out.println("x имеет большее значение чем y, x оставляем равным " + x);
      System.out.println("y = " + y);
    } else if (x < y) {
      z = x;
      x = y;
      System.out.println("x = " + y);
      System.out.println("y = " + z);
    } else {
      System.out.println("Значения x = y");
    }
  }
}
