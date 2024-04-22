import java.util.*;

public class PN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.print("positive");
        }
        if (number == 0) {
            System.out.print("zero");
        }
        if (number < 0) {
            System.out.println("negative");
        }

    }
}