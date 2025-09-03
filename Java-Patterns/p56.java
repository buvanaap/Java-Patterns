// * * * * * * * 
//  *         * 
//   *       * 
//    *     * 
//     *   * 
//      * * 
//       * 
//      * * 
//     *   * 
//    *     * 
//   *       * 
//  *         * 
// * * * * * * * 


public class p56{
    public static void main(String[]args){
        int rows=7;
    for(int i=rows;i>0;i--){
            for(int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j==0||j==i-1||i==rows){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
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