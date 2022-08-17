
public class pattern{
    public static void main(String[] args) {
        int n=4;
        // upper half
        for(int i=1;i<=n;i++){
            // inner loop for 1st part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // inner loop for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //inner loop for 2nd part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i=n;i>=0;i--){
            //inner loop for 1st part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //inner loop for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //inner loop for 2nd part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}