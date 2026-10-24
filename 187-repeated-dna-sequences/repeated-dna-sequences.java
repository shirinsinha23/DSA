class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> z = new ArrayList<>();
        if (s.length() > 10) {
            Map<String, Integer> e = new HashMap<>();
            for (int i = 0; i <= s.length() - 10; i++) {
                String a = s.substring(i, i + 10);
                if (e.getOrDefault(a, 0) == 1) z.add(a);
                e.put(a, e.getOrDefault(a, 0) + 1);
            }
        }
        return z;
    }
}

        
    
