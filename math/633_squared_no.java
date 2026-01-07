class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long)Math.sqrt(c);

        while(a <=b){
            long temp= a*a + b*b;
            if(temp==c){
                return true;
            } else if(temp < c){  
                a++;
            }
          
            else{
                b--;
            }
        }
        return false;
    }

}