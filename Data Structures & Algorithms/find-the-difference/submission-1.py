class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        unique = (ch for ch in s) 
        for ch in t: 
            if ch not in s: 
                return ch
        