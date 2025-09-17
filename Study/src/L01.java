public class L01 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
            boolean sign = false;
            for(int i = 0;i < nums.length - 1;i++){
                for(int j = i + 1;j < nums.length;j++ ){
                    if(nums[i] + nums[j] == target){
                        arr[0] = i;
                        arr[1] = j;
                        sign = true;
                        break;
                    }
                }
                if(sign)
                    break;
            }
            return arr;
        }
    }
}
