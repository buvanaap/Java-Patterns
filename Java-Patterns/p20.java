// 7 7 7 7 7 7 7 
//  6 6 6 6 6 6 
//   5 5 5 5 5 
//    4 4 4 4 
//     3 3 3 
//      2 2 
//       1 

public class p20 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=rows;i>0;i--){
            for(int k=i;k<rows;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
