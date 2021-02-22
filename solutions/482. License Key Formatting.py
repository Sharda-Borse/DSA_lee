class Solution:
    def licenseKeyFormatting(self, S: str, K: int) -> str:
        #print(S)
        S=S.replace("-","").upper()[::-1]
        #print(S)
        return '-'.join(S[i:i+K] for i in range(0,len(S),K))[::-1]
