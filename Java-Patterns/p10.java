// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7


public class p10 {
    public static void main(String[] args) {
        int rows=7,n=1,col=7;
        for(int i=0;i<rows;i++){
            for(int j=col;j>i;j--){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
            n=1;
        }
        for(int i=2;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
