// 1 2 3 4 5 6 7 
//   1 2 3 4 5 6 
//     1 2 3 4 5 
//       1 2 3 4 
//         1 2 3 
//           1 2 
//             1 

public class p13 {
    public static void main(String[]args){
         int rows=6,n=1;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<i;k++){
               System.out.print("  ");
            }
             for(int j=7;j>i;j--){
                System.out.print(n+" ");
                n++;
             }
             System.out.println();
             n=1;
        }
    }
    
}
