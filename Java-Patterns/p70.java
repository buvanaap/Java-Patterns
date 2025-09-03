//       Z 
//      Y Z
//     X Y Z
//    W X Y Z
//   V W X Y Z
//  U V W X Y Z
// T U V W X Y Z


public class p70 {
    public static void main(String[] args) {
        int rows=7;
         for(int i=1;i<=rows;i++){
            char ch=(char)('Z'-i+1);
            for(int k=i;k<rows;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
         }        
    }}

