import java.util.Scanner;
class product{
    public static void main(String[]ars){
        Scanner s=new Scanner(System.in);
         System.out.println("Enter 1st number: ");
        int a=s.nextInt();
         System.out.println("Enter 2nd number: ");
        int b=s.nextInt();
        int c=a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
}