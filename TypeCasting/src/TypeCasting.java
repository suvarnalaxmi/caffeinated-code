import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num= sc.nextInt();
        System.out.println("Enter a float number: ");
        float num1=sc.nextFloat();
        System.out.println("Integer to Float: "+(float)num);
        System.out.println("Float to integer: "+(int)num1);

        //automatic type promotion in expression
        int a =257;
        byte b1=(byte)a; // 257% 256 = 1

        System.out.println("value of b1: "+b1); //prints 1

        int number= 'A';
        System.out.println(number);  //ascii value of A is stored in var number i.e 65

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) +" "+ (i / c) +" "+ (d * s));
        System.out.println(result);
    }
}