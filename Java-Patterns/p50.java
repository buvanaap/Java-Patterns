//             * 
//           * * 
//         * * * 
//       * * * * 
//     * * * * * 
//   * * * * * * 
// * * * * * * * 
//   * * * * * * 
//     * * * * * 
//       * * * * 
//         * * * 
//           * * 
//             * 


public class p50 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int k=rows;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<rows;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=rows;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
