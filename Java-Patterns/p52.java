// * 
// * * 
// *   * 
// *     * 
// *       * 
// *         * 
// * * * * * * * 



public class p52 {
    public static void main(String[]args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((j==1)||(i==j)){
                    System.out.print("* ");
                }else if(i==7){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
