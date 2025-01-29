class Solution6 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int x : nums) {
            if((k==0) ||(x !=nums[k-1])) {
                nums[k] = x;
                k++;
            }
        } 
        return k;
    }
}
class LTCode006 {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; 
        
        int k = solution.removeDuplicates(nums);
        
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}