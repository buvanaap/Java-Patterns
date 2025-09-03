//     1 
//    2 3 
//   3 4 5 
//  4 5 6 7 
// 5 6 7 8 9 



public class p18 {
    public static void main(String[]args){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int k=i;k<=rows;k++){
                System.out.print(" ");
            }
            for(int j=i;j<2*i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
