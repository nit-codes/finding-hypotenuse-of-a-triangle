import java.util.Scanner;

public class main {
    public static void main(String [] args){

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the triangle: ");
         x = scanner.nextDouble();
        System.out.println("Enter the base of the triangle: ");
         y = scanner.nextDouble();

         z = Math.sqrt((x*x)+(y*y));
         System.out.println("The hypotenuse of the triangle is "+z);
    }
    
}
