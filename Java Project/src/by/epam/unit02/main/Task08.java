package by.epam.unit02.main;

public class Task08 {
  public static void main(String[] args) {
    double x,y;
    x=0;
    y=0;
    boolean answer;

    if(y<=0 & y>=-3) {
      if(x>=-4 & x<=4) {
        answer=true;
      }else {
        answer=false;
      }
    }else {
      if (y>=0 & y<=4) {
        if(x>=-2 & x<=2) {
          answer=true;
        }else {
          answer=false;
        }
      }else {
        answer=false;
      }
    }

    System.out.println(answer);

  }
}
