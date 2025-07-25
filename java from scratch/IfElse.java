import java.util.Scanner;
class IfElse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();
        if(salary>=20000||age<=25){
            System.out.print("Enter loan amount : ");
            double loan = sc.nextDouble();
            if(loan<=50000){
                System.out.print("Eligible for loan");
            }
            else{
                System.out.print("Maximum loan amount is 50000");
            }
        }
        else{
            System.out.print("You are not eligible");
        }
    }
}