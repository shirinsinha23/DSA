class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];

        int cnt = 0;

        for (int x = 2; x < n; x++) {
            prime[x] = true;
    }

    for (int i = 2; i < n; i++) {
            if (prime[i] == true) {
                cnt++;

                for (int j = 2 * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        return cnt;

    }
}