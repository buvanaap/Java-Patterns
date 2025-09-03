// 1 
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
// 1 2 3 4 5 6 7 6 5 4 3 2 1



public class p11 {

    public static void main(String[]args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(2*i)-1;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }else{
                    System.out.print((2*i)-j+" ");
                }
            }
            System.out.println();
        }
    }
    
}
