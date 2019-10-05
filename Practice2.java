import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String inputString = scanner.nextLine();
        System.out.println("Enter index of substring");
        int index = scanner.nextInt();
        System.out.println("Substring is");
        System.out.println(inputString.substring(index));
    }
}
