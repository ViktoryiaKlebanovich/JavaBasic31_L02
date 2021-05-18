package by.epam.unit02.main;

public class Task04 {
  public static void main(String[] args) {
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    int rx, ry;
    double result;
    x1 = 4;
    x2 = 5;
    y1 = 2;
    y2 = 8;
    rx = x2 - x1;
    ry = y2 - y1;
    result = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));
    System.out.println("Расстояние между двумя точками =" + result);
  }
}
