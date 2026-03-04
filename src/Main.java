public class Main {
    public static void main(String[] args) {
        // Patten Program Practice
        int n = 6;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int min = Math.min(row,Math.min(col,Math.min(n-col+1,n-row+1)));
                System.out.print(min);
            }
            System.out.println();
        }
    }
}






