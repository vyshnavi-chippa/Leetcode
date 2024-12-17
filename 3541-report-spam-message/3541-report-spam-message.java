import java.util.*;
import java.lang.*;
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        
        int c=0;
        Arrays.sort(bannedWords);
        for(String msg:message){
           
                            if(Arrays.binarySearch(bannedWords,msg)>=0){
                            c++;}
            
            if(c>=2)
            return true;
        }
        
        return false;
    }
}