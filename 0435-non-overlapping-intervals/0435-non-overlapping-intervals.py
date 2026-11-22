class Solution:
    def eraseOverlapIntervals(self, intervals: list[list[int]]) -> int:
        intervals.sort(key=lambda x: x[1])   
        ans = 0
        prev_end = float('-inf')

        for start, end in intervals:
            if start < prev_end:    
                ans += 1
            else:                    
                prev_end = end

        return ans