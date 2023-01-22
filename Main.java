public class Main
{
    /**
     * This class includes
     * a recursive static method that
     * returns the nthterm in the
     * fibonacci sequence and accepts
     * n as a parameter
     *
     * @author Michael Gonzalez
     * @param n
     * @return
     */
    public static int nthterm(int n){

        /**
         * This is the recursive method
         * that returns the nth term
         * in the fibonacci sequence
         */

        if(n==0)return 0;
        if(n==1 || n==2) return 1;
        return nthterm(n-1)+nthterm(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("The "+n+"th term of Fibonacci sequence is "+nthterm(n));
    }
}