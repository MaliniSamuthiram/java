import java.util.Scanner;
class DoWhile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    do{
        System.out.println("Enter the number < 10 : ");
        count = sc.nextInt();
    }
    while(count<10);
}
}
