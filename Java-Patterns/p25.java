// 1 2 3 4 5 6 7 
//  2 3 4 5 6 7 
//   3 4 5 6 7 
//    4 5 6 7 
//     5 6 7 
//      6 7 
//       7 
//      6 7 
//     5 6 7 
//    4 5 6 7 
//   3 4 5 6 7 
//  2 3 4 5 6 7 
// 1 2 3 4 5 6 7 




public class p25 {
   public static void main(String[] args) {
        int rows=7;
    for(int i=1;i<=rows;i++){
        for(int k=1;k<i;k++){
            System.out.print(" ");
        }
        for(int j=i;j<=rows;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    for(int i=rows-1;i>0;i--){
        for(int k=1;k<i;k++){
            System.out.print(" ");
        }
        for(int j=i;j<=rows;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
    
}
