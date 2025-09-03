// G F E D C B A 
// G F E D C B 
// G F E D C 
// G F E D 
// G F E 
// G F 
// G 


public class p66 {
     public static void main(String[]args){
     int rows=7;
  char ch='G';
  for(int i=rows;i>0;i--){
    for(int j=1;j<=i;j++){
        System.out.print(ch+" ");
        ch--;
    }
    System.out.println();
    ch='G';
  }
 } 
}
