//       A 
//      A B
//     A B C
//    A B C D
//   A B C D E
//  A B C D E F
// A B C D E F G
//  A B C D E F
//   A B C D E
//    A B C D
//     A B C
//      A B
//       A


public class p72 {
    public static void main(String[] args) {
        int rows=13;
        char ch='A';
        for(int i=1;i<=rows;i++){
            if(i<=7){
              for(int k=i;k<(rows+1)/2;k++){
                System.out.print(" ");
                
              }
              for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
              }
              System.out.println();
              ch='A';
            }else{
                for(int k=1;k<=i-7;k++){
                    System.out.print(" ");
                }
                for(int j=rows-i+1;j>0;j--){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
                ch='A';
            }
        }
    }
}
