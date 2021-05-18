package by.epam.unit02.main;

public class Task06 {
  public static void main(String[] args) {
    double M = 458569;
    double N = 874;
    double d = M / N;
    System.out.println("Результат деления М на N = " + d);
    int x;
    x = (int) d;
    System.out.println("Целая часть числа = " + x);
    System.out.println("Младшая цифра целой части = " + x % 10); //Остаток от деления на 10
    d = d - x;
    System.out.println("Дробная часть числа = " + d);
    d = d * 10;
    System.out.println("Перемещаем старшую цифру дробного числа в целые " + d);
    System.out.println("Старшая цифра дробной части " + (int) d);
  }
}
