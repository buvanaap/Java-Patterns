// 1111111
// 1111122
// 1111333
// 1114444
// 1155555
// 1666666
// 7777777

public class p28 {
   public static void main(String[] args) {
         int rows=7;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows;j++){
            if((i+j)>=8){
                System.out.print(i);
            }else{
                System.out.print(1);
            }
        }
        System.out.println();
    }
   }

    
}
