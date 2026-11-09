public class Q7PrimeNumbers {
    public static void main(String[] args) {
        int n = 786;

        for (int i=2; i<=n; i++) {
            boolean isPrime = true;

            if(i < 2) {
                isPrime = false;
            } else {
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } 

            if (isPrime){
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
