
 import java.util.Scanner;
 public class Calculator{
    public static void main(String[] args){
    
      double num1,num2;
         Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Let's do some operation");
        System.out.println("Enter Your Number");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        System.out.println("Enter the Operators like(+,-,*,/)");
        char Op = sc.next().charAt(0);
        double o = 0;
        switch (Op){
         case '+':
         o= num1+num2;
         break;
         case '-':
         o=num1-num2;
         break;
         case'*':
         o=num1*num2;
         break;
         case'/':
         o=num1/num2;
         break;
         default:
         System.out.println("Please give right operator");
        }
        System.out.println("result: "+ num1+  " " + Op + " " + num2+" = "+o);

      
    }}
