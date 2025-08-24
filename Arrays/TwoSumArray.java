/*
===========================================================
Problem: TwoSumArray
Difficulty: Easy
===========================================================

Description:
Given an array of integers 'nums' and an integer 'target', 
return indices of the two numbers such that they add up to 'target'.
Assume that each input has exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Constraints:
1) 2 <= nums.length <= 10^4
2) -10^9 <= nums[i] <= 10^9
3) -10^9 <= target <= 10^9
4) Only one valid answer exists

Approach:
Brute-force: Check all pairs of numbers to see if they sum to target.

Time Complexity: O(n^2)
Space Complexity: O(1)
===========================================================
*/

Solution:-

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return empty if no solution found
    }
}
