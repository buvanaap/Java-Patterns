// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F 
// A B C D E F G 


public class p62 {
     public static void main(String[] args) {
        int rows=7;
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            ch='A';
        }
     
}
    
}
