import java.util.Scanner;
class Array{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0;i<5;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<=10;i++){
        System.out.println(num[i]);
        }
    }
}