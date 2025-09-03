//       A 
//      B A 
//     C B A 
//    D C B A 
//   E D C B A 
//  F E D C B A 
// G F E D C B A 



public class p69 {
    public static void main(String[]args){
        int rows=7;
        
        for(int i=1;i<=rows;i++){
            for(int k=i;k<rows;k++){
                System.out.print(" ");
            }
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
