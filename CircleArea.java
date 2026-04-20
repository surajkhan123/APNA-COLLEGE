import java.util.Scanner;

public class CircleArea {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius: ");
    float r = sc.nextFloat();

    // float r = 7;
    float area = 3.14f * r*r;
    System.out.println(area);

  }
}