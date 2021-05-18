package by.epam.unit02.main;

public class Task07 {
  public static void main(String[] args) {
    double x, y, z ,xPow, yPow, zPow;
    //Диапозон (-5, 5)
    x = - 5 ;
    y = 0 ;
    z = 15;

    if (x >= 0) {
      xPow = Math.pow(x, 2);
    } else {
      xPow = Math.pow(x, 4);
    }

    if (y >= 0) {
      yPow = Math.pow(y, 2);
    } else {
      yPow = Math.pow(y, 4);
    }

    if (z >= 0) {
      zPow = Math.pow(z, 2);
    } else {
      zPow = Math.pow(z, 4);
    }
    System.out.println("x = " + x + ", x в степени = " + xPow + "\n" +"y = " + y + ", y в степени = " + yPow + "\n" + "z = " + z + ", z в степени = " + zPow);

  }
}
