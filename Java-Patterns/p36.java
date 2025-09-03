// ******1
// *****12
// ****123
// ***1234
// **12345
// *123456
// 1234567


public class p36 {
    public static void main(String[] args) {
        int rows=7,n=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i+j<=7){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(n+" ");
                    n++;
                }
            }
            System.out.println();
            n=1;
        }
    }
    
}
