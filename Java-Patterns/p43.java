// * * * * * * * 
//  * * * * * * 
//   * * * * * 
//    * * * * 
//     * * * 
//      * * 
//       * 

public class p43 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=rows;i>0;i--){
            for(int k=i;k<rows;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
