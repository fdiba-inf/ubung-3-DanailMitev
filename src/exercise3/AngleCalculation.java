package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle;
        char type;
        do {
          angle = input.nextDouble();
          type = input.nextLine().charAt(0);

          if (type == 'r') {
            double newAngle = angle / Math.PI * 180;
            System.out.println("Angle: " + newAngle + "d");
          } else if (type == 'd'){
            double newAngle = angle * Math.PI / 180;
            System.out.println("Angle: " + newAngle + "r");
          }
        } while (type == 'r' || type == 'r');
    }
}