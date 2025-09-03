// *                         *   
// * *                     * *   
// * * *                 * * *   
// * * * *             * * * *   
// * * * * *         * * * * *   
// * * * * * *     * * * * * *   
// * * * * * * * * * * * * * *   
// * * * * * *     * * * * * *   
// * * * * *         * * * * *   
// * * * *             * * * *   
// * * *                 * * *   
// * *                     * *   
// *                         * 

public class p61 {
     public static void main(String[] args) {
        int rows=14;
        for(int i=1;i<rows;i++){
            for(int j=1;j<=rows;j++){
               if(i<=7){
                    if(i==7||j<=i||j==1||j==14||i+j>14){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
               }else{
                   if(i+j<=14||i<=j-1||j==1||j==14){
                       System.out.print("* ");
                   }else{
                       System.out.print("  ");
                   }
               }
            }
            System.out.println("  ");
        }
     
}
    
}
