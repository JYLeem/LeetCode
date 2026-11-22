class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        ans = 0
        minPrice = 99999999

        for p in prices:
            minPrice = min(p, minPrice)
            ans = max(p-minPrice, ans)

        return ans

