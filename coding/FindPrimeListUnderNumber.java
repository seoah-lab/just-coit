package coding;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeListUnderNumber {
        public static List<Integer> findPrimeListUnderNumber(int number) {
        List<Integer> primeList = new ArrayList<>();

        for (int n = 2; n <= number; n++) {
            
            boolean isPrime = true;
            for (int i : primeList) {
                if (i * i <= n && n % i == 0) {    
                    isPrime = false;               
                    break;                         
                }                                  
            }
            if (isPrime) {
                primeList.add(n);
            }
        }

        return primeList;
    }

    public static void main(String[] args) {
        int input = 20;
        List<Integer> result = findPrimeListUnderNumber(input);
        System.out.println(result);
    }
}
