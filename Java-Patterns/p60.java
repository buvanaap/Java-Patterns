//             *
//           * *
//         *   *
//       *     *
//     *       *
//   *         *             
// *           *
//   *         *
//     *       *
//       *     *
//         *   *
//           * *
//             *


public class p60 {
     public static void main(String[] args) {
        int rows=13;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
               if(i<=7){
                    if(j==7||i+j==8){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
               }else if(i>7){
                   if(i-j==6||j==7){
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
