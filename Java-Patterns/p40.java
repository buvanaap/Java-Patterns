// 1 2 3 4 5 6 7 8 9 
// 2 3 4 5 6 7 8 9 1 
// 3 4 5 6 7 8 9 1 2 
// 4 5 6 7 8 9 1 2 3 
// 5 6 7 8 9 1 2 3 4 
// 6 7 8 9 1 2 3 4 5 
// 7 8 9 1 2 3 4 5 6 
// 8 9 1 2 3 4 5 6 7 
// 9 1 2 3 4 5 6 7 8 


public class p40 {
    public static void main(String[] args) {
        int rows=9;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i+j>10){
                    System.out.print((i+j-1)%9+" ");
                }else{
                    System.out.print((j+i)-1+" ");
                }
            }
            System.out.println();
        }
    }
    
}
