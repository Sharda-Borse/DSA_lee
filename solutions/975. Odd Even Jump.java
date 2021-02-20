class Solution {
    public int oddEvenJumps(int[] A) {
        
        int n=A.length;
        TreeMap<Integer,Integer> map=new TreeMap();
        boolean higher[]=new boolean[n];
        boolean lower[]=new boolean[n];
        lower[n-1]=higher[n-1]=true;
        
        int res=1;
        map.put(A[n-1],n-1);
        for(int i=n-2;i>=0;i--){
            Map.Entry<Integer,Integer> hi=map.ceilingEntry(A[i]),lo=map.floorEntry(A[i]);
            if(hi!=null)
                higher[i]=lower[(int)hi.getValue()];
            if(lo!=null)
                lower[i]=higher[(int)lo.getValue()];
            if(higher[i])
                res++;
            map.put(A[i],i);
        }
        
        return res;
    }
}
