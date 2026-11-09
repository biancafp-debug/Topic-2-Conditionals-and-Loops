public class Q4FactorialNumber {
    public static void main(String[] args) {
        int n=4, factN=1;
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        System.out.println(n + " factorial is " + factN);
    }
}
