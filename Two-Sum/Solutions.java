public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            return nums;
        }
        int[] ret = new int[2];
        //key is the value in nums.
        //value is index in nums.
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++) {
            if(!hm.containsKey(target-nums[i])) {
                hm.put(nums[i], i);
            }
            else {
                if(hm.get(target-nums[i]) > i) {
                    ret[0] = i+1;
                    ret[1] = hm.get(target-nums[i])+1;
                }
                else {
                    ret[0] = hm.get(target-nums[i])+1;
                    ret[1] = i+1;
                }
            }
        }
        
        return ret;
    }
