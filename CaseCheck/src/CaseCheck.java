import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().trim().charAt(0);

       if(ch>'a' && ch <='z')
       {
           System.out.println("Lowercase");
       }
       else{ //here note that if another symbols or digits are given as input it will execute the else part
           System.out.println("Uppercase");
       }
    }
}