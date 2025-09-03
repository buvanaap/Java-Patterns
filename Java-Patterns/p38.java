// 1
// 1*2
// 1*2*3
// 1*2*3*4
// 1*2*3*4*5
// 1*2*3*4*5*6
// 1*2*3*4*5*6*7

public class p38 {
    public static void main(String[] args) {
        int rows=7,n=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print(n+" ");
                    n++;
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
            n=1;
        }
    }
    
}
