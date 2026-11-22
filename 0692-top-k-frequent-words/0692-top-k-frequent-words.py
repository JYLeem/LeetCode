class Solution:
    def topKFrequent(self, words: list[str], k: int) -> list[str]:
        cnt = Counter(words)
        cnt = sorted(cnt, key = lambda x : (-cnt[x], x))[:k]

        return cnt