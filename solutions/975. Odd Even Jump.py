class Solution:
    def oddEvenJumps(self, A: List[int]) -> int:
        N=len(A)
        
        def make(B):
            ans=[None]*N;
            stack=[]
            for i in B:
                while stack and i>stack[-1]:
                    ans[stack.pop()]=i
                stack.append(i)
            return ans
        B=sorted(range(N),key =lambda i:A[i])
        oddNext=make(B)
        B.sort(key =lambda i:-A[i])
        evenNext=make(B)
        
        odd=[False]*N
        even=[False] *N
        odd[N-1]=even[N-1]=True
        for i in range(N-2,-1,-1):
            if oddNext[i] is not None:
                odd[i]=even[oddNext[i]]
            if evenNext[i] is not None:
                even[i]=odd[evenNext[i]];
       
        return sum(odd)
        
