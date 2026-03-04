public class Main {
    public static void main(String[] args) {
        // Patten Program Practice
        int n = 5;
        for (int row = 1; row <= n*2-1; row++) {
            int spaceCond = row<=n*2/2 ? n-row : row-n;
            for (int space = 1; space <= spaceCond; space++) {
                System.out.print(" ");
            }
            int starCond = row<=n*2/2? (row*2)-1 :(n*2-row)*2-1 ;
            for (int star = 1; star <= starCond; star++) {
                if(star==1 || star == starCond){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}






