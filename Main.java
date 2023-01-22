public class Main
{
    public static int nthterm(int n){
        if(n==0)return 0;
        if(n==1 || n==2) return 1;
        return nthterm(n-1)+nthterm(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("The "+n+"th term of Fibonacci sequence is "+nthterm(n));
    }
}