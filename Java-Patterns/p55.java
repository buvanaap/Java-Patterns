//       * 
//      * * 
//     *   * 
//    *     * 
//   *       * 
//  *         * 
// * * * * * * * 


public class p55 {
    public static void main(String[]args){
        int rows=7;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||j==i||i==rows-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
