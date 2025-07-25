import java.util.Scanner;
class NestedIfElse{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter score : ");
       int score = sc.nextInt();
       if(score<50){
        System.out.print("You need improvement:)");
       }
       else if(score>=50 && score<=70){
        System.out.print("Good job!");
       }
       else{
        System.out.print("Excellent performance!!");
       }
    }
}