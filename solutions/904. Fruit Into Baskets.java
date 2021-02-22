class Solution {
    public int totalFruit(int[] tree) {
        int lastFruit=-1,secondLastFruit=-1;
        int lastFruitCount=0;
        int max=0,curMax=0;
        for(int i:tree){
            int curFruit=i;
            if(lastFruit==curFruit){
                curMax++;
                lastFruitCount++;
            }
            else if(curFruit==secondLastFruit){
               curMax++;
                secondLastFruit=lastFruit;
                lastFruit=curFruit;
                lastFruitCount=1;
            }
            else{
                curMax=lastFruitCount+1;
                secondLastFruit=lastFruit;
                lastFruit=curFruit;
                lastFruitCount=1;
            }
            max=Math.max(max,curMax);
        }
        return max;
    }
}
