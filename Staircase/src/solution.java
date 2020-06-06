public class solution {

    static public void staircase(int n) {
        int num1;
        int num2;

        for(int i = 1; i<=n; i++) {
            for(num1=n-i; num1>0; num1--) {
                System.out.print(" ");
            }
            for(num2=1; num2<=i; num2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;

        staircase(n);
    }
}
