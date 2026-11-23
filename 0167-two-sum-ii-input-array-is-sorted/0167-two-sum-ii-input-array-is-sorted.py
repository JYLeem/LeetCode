class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        l,r = 0, len(numbers)-1
        
        while l < r:
            temp = target - numbers[l]
            if temp > numbers[r]:
                l+=1
            elif temp < numbers[r]:
                r-=1
            else: break
        
        return [l+1,r+1]