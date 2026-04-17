
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();

        if ((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("该年是润年");
        }else {
            System.out.println("不是润年,是平年");
        }

    }
}