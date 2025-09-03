// 1******
// 12*****
// 123****
// 1234***
// 12345**
// 123456*
// 1234567



public class p35 {
    public static void main(String[]args){
     int rows=7;
     for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows;j++){
           if(j<=i){
             System.out.print(j+" ");
           }else{
            System.out.print("*"+" ");
           }
        }
        System.out.println();
     }
    }
}
