// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9 
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9 
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9 
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9 
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9 
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9 
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9 
// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 
public class p41 {
    public static void main(String[]args){
        int n=9;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
               int left=j+1,right=2*n-1-j,top=i+1,bottom=2*n-1-i;
               int value= Math.min(Math.min(left, right), Math.min(top, bottom));
               int k=n-value+1;
               System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
