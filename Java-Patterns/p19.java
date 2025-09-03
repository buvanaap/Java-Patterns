//       1 
//      2 2 
//     3 3 3 
//    4 4 4 4 
//   5 5 5 5 5 
//  6 6 6 6 6 6 
// 7 7 7 7 7 7 7 


public class p19 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int k=i;k<=rows;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
          System.out.println();
        }
    }
    
}
