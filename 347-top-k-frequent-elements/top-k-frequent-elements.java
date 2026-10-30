class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> np=new HashMap<>();

        for(int num:nums){
            np.put(num, np.getOrDefault(num,0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
            (a,b) -> Integer.compare(b[0],a[0])
                    
        );
        for(int key :np.keySet()){
            pq.add(new int[]{np.get(key),key});
        }

        int ans[] = new int[k];
        int i=0;

        while(k-- > 0){
            int curr[] =pq.poll();
            ans[i++] = curr[1];
        }
        return ans;
    }
}