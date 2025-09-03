// 7
// 7 6
// 7 6 5
// 7 6 5 4
// 7 6 5 4 3
// 7 6 5 4 3 2
// 7 6 5 4 3 2 1


public class p5 {
    public static void main(String[] args) {
        int rows=7,col=7;
        for(int i=rows;i>0;i--){
            for(int j=col;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
