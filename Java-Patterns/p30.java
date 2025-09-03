// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15



public class p30 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            int num=i;
            int n=rows-1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=n;
                n--;
            }
            System.out.println();
        }
    }
    
}
