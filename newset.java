import java.util.Scanner;

public class newset {
    public static void main(String[] args) {
        int sub1;
        int sub2;
        int sub3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first subject marks");
        sub1 = sc.nextInt();
        if (sub1 >= 33) {
            System.out.println("Yes you are pass in this subject you got " + sub1);
        } else {
            System.out.println("Sorry you r fail...");
        }
        System.out.println("Enter the Second subject marks");
        sub2 = sc.nextInt();
        if (sub2 >= 33) {
            System.out.println("Yes you are pass in this subject you got " + sub2);
        } else {
            System.out.println("Sorry you r fail...");
        }
        System.out.println("Enter the third subject marks");
        sub3 = sc.nextInt();
        if (sub3 >= 33) {
            System.out.println("Yes you are pass in this subject you got " + sub3);
        } else {
            System.out.println("Sorry you r fail...");
        }
    }
}
