// 7 7 7 7 7 7 7 
// 6 6 6 6 6 6 
// 5 5 5 5 5 
// 4 4 4 4 
// 3 3 3 
// 2 2 
// 1 

public class p4{
    public static void main(String[]args){
        int n=7,rows=7,col=7;
        for(int i=0;i<=rows;i++){
            for(int j=col;j>i;j--){
                System.out.print(n+" ");
            }
            System.out.println();
            n--;
        }
    }
}