import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println("J".equalsIgnoreCase(String.valueOf(word.charAt(0))));
    }
}