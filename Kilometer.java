import java.util.Scanner;

public class Kilometer {
    public static void main(yo[] args) {
        System.out.println("Enter the Kilometer");
        Scanner sc = new Scanner(System.in);
        double Kilometer = sc.nextDouble();
        double miles = Kilometer/1.6;
        System.out.println(miles + " Miles");
    }
}
