public class PrintfPrime {
    public static void main(String[] args) {
        int isPrime = 0;
        int check = 0;
        for (isPrime = 1; isPrime <= 100; isPrime++) {
            for (check = 2; check < isPrime; check++) {
               
                if (isPrime % check == 0) {
                    break;
                }
            }        
            if (check == isPrime) {
                System.out.print(isPrime + " ");
            }
        }
    }
}
