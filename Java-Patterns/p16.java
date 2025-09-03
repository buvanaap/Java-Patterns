// 1234567
//  234567
//   34567
//    4567
//     567
//      67
//       7
//      67
//     567
//    4567
//   34567
//  234567
// 1234567


public class p16 {
    public static void main(String[]args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=rows-1;i>0;i--){
            for(int k=1;k<i;k++){
               System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
