// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F 
// A B C D E F G 
// A B C D E F 
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 



public class p73 {
    public static void main(String[]args){
        int rows=13;
        char ch='A';
        for(int i=1;i<=rows;i++){
            if(i<=7){
                for(int j=1;j<=i;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
                ch='A';
            }
            if(i>7){
                for(int j=rows-i+1;j>=1;j--){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
                ch='A';
            }
        }
    }
    
}
