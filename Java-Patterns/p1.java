// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7


public class p1{
    public static void pattern(int rows,int col){
        int n=1;
        for(int i=0;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
            n=1;
        }
    }
    public static void main(String[] args) {
           int rows=7;
           int col=7;
           pattern(rows,col);
    }
}