public class p65 {
 public static void main(String[]args){
     int rows=7;
  char ch='A';
  for(int i=rows;i>0;i--){
    for(int j=1;j<=i;j++){
        System.out.print(ch+" ");
        ch++;
    }
    System.out.println();
    ch='A';
  }
 }  
}
