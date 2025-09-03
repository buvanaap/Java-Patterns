//       7 
//      6 7 
//     5 6 7 
//    4 5 6 7 
//   3 4 5 6 7 
//  2 3 4 5 6 7 
// 1 2 3 4 5 6 7 


public class p21 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=rows;i>0;i--){
            for(int k=i;k>0;k--){
                System.out.print(" ");  
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
