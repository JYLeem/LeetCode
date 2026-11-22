class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        t = set()
        ans = 0
        l = 0

        for r, c in enumerate(s):
            while c in t:
                t.remove(s[l])
                l += 1
            t.add(c)
            ans = max(ans, len(t))
        
        return ans
