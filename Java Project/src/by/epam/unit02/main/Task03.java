package by.epam.unit02.main;

public class Task03 {
  public static void main(String[] args) {
    int T = 0;
    int hour, min, sec;
    int saveNumberOfSeconds;
    T = 67099;
    saveNumberOfSeconds = T;
    hour = T / 3600;
    T = T - hour * 3600;
    min = T / 60;
    T = T - min * 60;
    sec = T;
    System.out.println(saveNumberOfSeconds + " секунд это: " + hour + " ч. " + min + " мин. " + sec + " сек.");
  }
}
