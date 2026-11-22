class Solution:
    def customSortString(self, order: str, s: str) -> str:
        cnt = Counter(s)
        result = []

        for ch in order:
            result.append(ch * cnt[ch])
            del cnt[ch]
        
        for ch, c in cnt.items():
            result.append(ch * c)
        
        return ''.join(result)
