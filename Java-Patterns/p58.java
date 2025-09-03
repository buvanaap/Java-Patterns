//             * 
//           * * 
//         *   * 
//       *     * 
//     *       * 
//   *         * 
// * * * * * * * 



public class p58 {
    public static void main(String[]args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j==8)||j==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    
}
