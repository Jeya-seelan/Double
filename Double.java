import java.util.*;
class Double{
 public static void main(String args[]){
  int n ,c=0;
  Scanner s=new Scanner(System.in);
  n = s.nextInt();
  while(n>0){
   c+=(n%2);
   n/=2;
  }
  System.out.print(c);
 }
}