import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double width = scanner.nextDouble();
        double s = L * width;
        System.out.println(s);
    }
}