class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    long sum = 0L + nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        li.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }
                }
            }
        }
        return li;
    }
}

// Tc- O(n^4)
//  Set<List<Integer>> li = new HashSet<>();
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     for (int l = k + 1; l < n; l++) {
//                         long sum = 0L+nums[i] + nums[j] + nums[k] + nums[l];
//                         if (sum == target) {
//                             List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k],
//                             nums[l]); li.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(li);