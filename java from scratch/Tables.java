import java.util.Scanner;
class Tables{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i=i+1){
            System.out.println(i+" x "+num+" = "+i*num);
        }
    }
}