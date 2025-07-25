import java.util.Scanner;
class P1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Float mark = sc.nextFloat();
        mark = mark/10;
        sc.nextLine();
        String department = sc.nextLine();
        // int age = sc.nextInt();
        // sc.nextLine();
        // String address = sc.nextLine();
        System.out.println("The name is "+name);
        System.out.println("Score is "+mark);
        System.out.println("Department is "+department);
        // System.out.println("Age is "+age);
        // System.out.println("The Address is "+address);
    }
}                                    