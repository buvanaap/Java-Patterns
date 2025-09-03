// * 
// * * 
// *   * 
// *     * 
// *       * 
// *         * 
// *           * 
// *         *     
// *       *         
// *     *             
// *   *                 
// * *                     
// * 

public class p59 {
     public static void main(String[] args) {
       int rows=13;
       for(int i=1;i<=rows;i++){
           for(int j=1;j<=i;j++){
               if(i<=7){
                   if(j==1||i==j){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
               }else{
                   if(j==1||(i+j==14)){
                       System.out.print("* ");
                   }else{
                       System.out.print("  ");
                   }
               }
           }
           System.out.println();
       }
    }
    
}
