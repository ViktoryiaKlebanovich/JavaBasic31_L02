package by.epam.unit02.main;

public class Task05 {
  public static void main(String[] args) {
    double x = 0;
    double y = 0;
    double answer;
    answer = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) *
        Math.tan(x * y);

    System.out.println("Ответ = " + answer);

  }
}
