// 0000000
// 0100000
// 0020000
// 0003000
// 0000400
// 0000050
// 0000006

public class p29 {
    public static void main(String[] args) {
        int rows=7,n=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(i==j){
                    System.out.print(j);
                }else{
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    } 
    
}
