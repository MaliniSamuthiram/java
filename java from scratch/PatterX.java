import java.util.*;
public class PatterX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter String ");
        String s = sc.nextLine();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n-i-1);
            if(j==i){
                System.out.print(ch1);
            }
            else if(j==n-i-1){
                System.out.print(ch2);
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
        sc.close();
    }
}