class Solution {
    public int residuePrefixes(String s) {
        Set<Character> seen= new HashSet<>();
        int residue=0;      /*number of distinct characters
                            ==
                            (length of the prefix % 3)*/
            for(int i=0;i<s.length();i++){
            seen.add(s.charAt(i));
            int distinct= seen.size();
            int mod= (i+1)%3;

            if(mod==distinct){
                residue++;
            }
        }
        return residue;
    }
}