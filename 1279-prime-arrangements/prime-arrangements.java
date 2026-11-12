import java.util.Arrays;

class Solution {
    public int numPrimeArrangements(int n) {
        int MOD = 1000000007;

        // Step 1: Find prime numbers using Sieve of Eratosthenes
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 2, n + 1, true);

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Step 2: Count prime numbers
        long cnt = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                cnt++;
            }
        }

        // Step 3: Count non-prime numbers
        long nonPrime = n - cnt;

        // Step 4: Calculate factorial of prime count with modulo
        long ans1 = 1;
        for (int i = 1; i <= cnt; i++) {
            ans1 = (ans1 * i) % MOD;
        }

        // Step 5: Calculate factorial of non-prime count with modulo
        long ans2 = 1;
        for (int i = 1; i <= nonPrime; i++) {
            ans2 = (ans2 * i) % MOD;
        }

        // Step 6: Return final answer
        return (int) ((ans1 * ans2) % MOD);
    }
}

        
    
