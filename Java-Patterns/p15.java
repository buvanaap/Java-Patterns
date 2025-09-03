// 7 6 5 4 3 2 1 
//   6 5 4 3 2 1 
//     5 4 3 2 1 
//       4 3 2 1 
//         3 2 1 
//           2 1 
//             1


public class p15 {
    public static void main(String[]args){
        int rows=7;
        for(int i=rows;i>0;i--){
            int n=i;
            for(int k=7;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n--;
            }
            System.out.println();
            
        }
    }
    
}
