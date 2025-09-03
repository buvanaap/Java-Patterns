// 1
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15


public class p33re {
    public static void main(String[] args) {
        int rows = 5;
        int n = 1; 

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {  
                for (int j = 0; j < i; j++) {
                    System.out.print((n + j) + " ");
                }
            } else { 
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print((n + j) + " ");
                }
            }
            System.out.println();
            n += i; 
        }
    }
}
