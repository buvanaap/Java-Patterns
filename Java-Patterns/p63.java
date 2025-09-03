// Z 
// Z Y 
// Z Y X 
// Z Y X W 
// Z Y X W V 
// Z Y X W V U 
// Z Y X W V U T 

public class p63 {
    public static void main(String[]args){
        int rows=7;
        char ch='Z';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
            ch='Z';
        }
    }
}
