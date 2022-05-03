import java.util.Scanner;

public class Program {
    public static void main(yo[] args) {
        float Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total subject you have");
        float subject = sc.nextFloat();
        System.out.println("Enter the first subject marks");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the second subject marks");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the third subject marks");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the fourth subject marks");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the fifth subject marks");
        float sub5 = sc.nextFloat();
        float per = (sub1 + sub2 + sub3 + sub4 + sub5)/500;
        float cgpa = (per * 100);
        System.out.println(cgpa);
    }
}
