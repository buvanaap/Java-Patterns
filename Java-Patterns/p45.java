// * * * * * * * 
//  * * * * * * 
//   * * * * * 
//    * * * * 
//     * * * 
//      * * 
//       * 


public class p45 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=rows;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
