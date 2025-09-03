// 1 2 3 4
// 5 6 7
// 8 9
// 10



public class p32 {
    public static void main(String[] args) {
        int rows=4,n=1;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    
}
