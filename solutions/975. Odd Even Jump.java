class Solution {
    public int oddEvenJumps(int[] A) {
        int n=A.length;
        boolean lower[]=new boolean[n];
        boolean higher[]=new boolean[n];
        lower[n-1]=true;
        higher[n-1]=true;
        TreeMap<Integer,Integer> map=new TreeMap();
        map.put(A[n-1],n-1);
        int count=1;
        
        for(int i=n-2;i>=0;i--){
            Map.Entry<Integer,Integer> high=map.ceilingEntry(A[i]),low=map.floorEntry(A[i]);
            if(high!=null)
                higher[i]=lower[high.getValue()];
            if(low!=null)
                lower[i]=higher[low.getValue()];
            if(higher[i])
                count++;
            map.put(A[i],i);
        }
        return count;
    }
}
