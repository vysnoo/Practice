public class Main {
    public static void main(String[] args) {
        // Patten Program Practice
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                if (row == n) {
                    System.out.print("*");
                } else if (star == 1 || star == row * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






