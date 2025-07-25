import java.util.Scanner;
class Arithmetic{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Add : "+c);
        System.out.println("Sub : "+d);
        System.out.println("Multiply : "+e);
        System.out.println("Divide : "+f);
        System.out.println("Modulo : "+g);
    }
}