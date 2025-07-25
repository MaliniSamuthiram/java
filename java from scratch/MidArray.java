import java.util.Scanner;
class MidArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Middle element is "+num[size/2]);
    }
}