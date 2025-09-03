// 1010101
// 0101010
// 1010101
// 0101010
// 1010101
// 0101010
// 1010101


public class p27 {
    public static void main(String[] args) {
        int n=1,m=0,rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i%2!=0 && j%2!=0){
                    System.out.print(n);
                }
                else if((i%2!=0 && j%2==0)){
                    System.out.print(m);
                }else if(i%2==0 && j%2!=0){
                     System.out.print(m);
                }else{
                    System.out.print(n);
                }
            }
             System.out.println();
        }
       
    }
    
}
