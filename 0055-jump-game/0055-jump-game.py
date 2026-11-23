class Solution:
    def canJump(self, nums: list[int]) -> bool:
        far = 0
        for i in range(len(nums)):
            if i > far:
                return False
            
            far = max(nums[i] + i, far)
        
        return True