import java.util.Scanner;
class SimpleIfElse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        if(a==b){
            System.out.print("A and B are equal");
        }
        else{
            System.out.print("A and B are not equal");
        }
    }
}