class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S=S.replaceAll("[-]","").toUpperCase();
        StringBuilder sb=new StringBuilder(S);
        int i=S.length()-K;
        while(i>0){
            sb.insert(i,"-");
            i=i-K;
        }
        return sb.toString();
    }
}
