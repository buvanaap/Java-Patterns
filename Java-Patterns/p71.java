// ABCDEFG
//  ABCDEF
//   ABCDE
//    ABCD
//     ABC
//      AB
//       A
//      AB
//     ABC
//    ABCD
//   ABCDE
//  ABCDEF
// ABCDEFG

public class p71 {
    public static void main(String[] args) {
        int rows=13;
        char ch='A';
        for(int i=1;i<=rows;i++){
            if(i<=7){
                for(int k=1;k<i;k++){
                    System.out.print(" ");
                }
                for(int j=7;j>=i;j--){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
                ch='A';
            }
            else{
                for(int j=1;j<=7;j++){
                    if(i+j>=14){
                        System.out.print(ch);
                        ch++;
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                ch='A';
            }
        }
    }}
