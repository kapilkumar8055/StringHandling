import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars:\t");
        for (int j = 0; j < name.length(); j++) {
            System.out.print(name.charAt(j) + "\t");
        }
    }
}
