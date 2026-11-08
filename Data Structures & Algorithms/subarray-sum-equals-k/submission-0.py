class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # Brute Force 
        res = 0
        for i in range(len(nums)): 
            curSum = 0
            for j in range(i, len(nums)):  
                curSum += nums[j]  

                if (curSum == k): 
                    res += 1
        return res