// 1
// 10
// 101
// 1010
// 10101
// 101010
// 1010101

public class p26 {

    public static void main(String[]args){
        int n=1,m=0,rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(n);
                }else{
                    System.out.print(m);
                }
            }
            System.out.println();
        }
    }
    
}
