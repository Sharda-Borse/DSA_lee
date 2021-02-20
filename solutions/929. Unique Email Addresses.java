class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet();
        
        for(String email:emails){
            int indexOfSep=email.indexOf('@');
            String local=email.substring(0,indexOfSep);
            String domain=email.substring(indexOfSep);
            local=local.replaceAll("\\.","");
            if(local.contains("+"))
                local=local.substring(0,local.indexOf('+'));
            set.add(local+domain);
        }
        
        
        return set.size();
    }
}
