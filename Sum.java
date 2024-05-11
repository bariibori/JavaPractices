import java.util.*;
public class Sum {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter Frist Number: ");
        double x= sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double y=sc.nextDouble();
        System.out.println("Enter Third Number: ");
        double z =sc.nextDouble();
        double Sum=x+y+z;
        System.out.println("The SUM of Three Number is = "+Sum);
      }
    }
}
