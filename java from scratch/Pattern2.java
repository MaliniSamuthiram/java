public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}
