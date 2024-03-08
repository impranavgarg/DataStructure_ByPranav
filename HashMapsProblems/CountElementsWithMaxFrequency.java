

public class CountElementsWithMaxFrequency{
  public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxfreq = 0;
        int count =0;

        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(nums[i]) );

        }
        for (int freq : map.values()) {
            if (freq == maxfreq)   {
                count += freq;
            } 
        }

        return count;
    }



}
