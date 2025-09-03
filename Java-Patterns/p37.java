// 1
// 1*3
// 1*3*5
// 1*3*5*7
// 1*3*5*7*9
// 1*3*5*7*9*11
// 1*3*5*7*9*11*13


public class p37 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print(j+" ");
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
    
}
