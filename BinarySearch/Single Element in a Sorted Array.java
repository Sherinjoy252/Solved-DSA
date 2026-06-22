class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l=1, r=n-2;
        if(nums.length == 1){
            return nums[0];
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }

        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            // using xor property:
            // mid	Binary	mid ^ 1	Binary
            // 0	0000	1	0001
            // 1	0001	0	0000
            // 2	0010	3	0011
            // 3	0011	2	0010
            // 4	0100	5	0101
            // 5	0101	4	0100
            // 6	0110	7	0111
            // 7	0111	6	0110
            // if(nums[mid] != nums[mid ^ 1]){
            //     r = mid - 1;
            // }
            // else{
            //     l = mid+1;
            // }
            if((mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid] == nums[mid-1])){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return 0;


    }
}