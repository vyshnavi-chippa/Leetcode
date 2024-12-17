class Solution {
    boolean move(int s,int d,int[] nums){
        int n=nums.length;
            int[] numsCopy = nums.clone(); 
            int curr = s;
            int dir = d; 
            
            while (curr >= 0 && curr < n) {
                if (numsCopy[curr] == 0) {
                   
                    curr += dir;
                } else {
                    
                    numsCopy[curr]--;
                    dir = dir*-1;  
                    curr += dir;
        }
                boolean allZero = true;
                for (int num : numsCopy) {
                    if (num != 0) {
                        allZero = false;
                        break;
                    }
                }
                
                if (allZero) {
                    return true;
                }
            }
            
            return false;
        }
    
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int c=0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
               
                if (move(i, 1,nums))
                    c++;
                    if(move(i, -1,nums)) {
                    c++;
                }
            }
        }
        
        return c;
    }
        
    
}