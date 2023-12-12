import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int max = 0;

   if(a > b)
   {
       max=a;
   }
   else {
       max=b;
   }
   if (c > max)
   {
       max=c;
   }
        System.out.println(max);
   }
}