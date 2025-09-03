// 1
// *2*
// **3**
// ***4***
// ****5****
// *****6*****
// ******7******

public class p34 {
    public static void main(String[]args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*i-1;j++){
               if(i==j){
                System.out.print(j+" ");
               }else{
                System.out.print("*"+" ");
               }
            }
            System.out.println();
        }
    }
    
}
