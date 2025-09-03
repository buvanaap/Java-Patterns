// p q r s t u v 
// p q r s t u 
// p q r s t 
// p q r s 
// p q r 
// p q
// p

public class p67 {
    public static void main(String[] args) {
        char ch='p';
        int rows=7;
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            ch='p';
        }
    }}

