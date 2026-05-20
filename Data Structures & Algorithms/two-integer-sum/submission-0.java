class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> data = new HashMap<>();
        int[] remArr = new int[2];

       for(int i=0; i<nums.length; i++){
        int rem = target - nums[i];
        if(data.containsKey(rem)){
            remArr[0] = data.get(rem);
            remArr[1] = i;
            return remArr;
        }
        data.put(nums[i], i);
       }
       return remArr;

        
    }
}
