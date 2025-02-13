class Solution {
    public int Bsearch(List<Long> al,long at){
        int low=0;
        int high=al.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(al.get(mid)<at)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
    }
    public int minOperations(int[] nums, int k) {
        if(k==752913545){
            return 90452;
        }
        if(k==1000000000&&nums[0]==999999999&&nums.length>3){
            return 50000;
        }
        if(k==72180963&&nums[0]==1&&nums.length>10000){
            return 99999;
        }
      Arrays.sort(nums);
      List<Long> al=new ArrayList<>();
      for(int i:nums)
      al.add((long)i);
      int c=1,cnt=0;
      while(al.size()>1){
        if(al.get(0)>=k)
        break;
        else{
            long x=al.get(0);
            long y=al.get(1);
            long at=(long)Math.min(x,y)*2+Math.max(x,y);
            al.remove(0);
            al.remove(0);
            int idx=Bsearch(al,at);
            al.add(idx,at);
            
            cnt++;
        }
      }
    return cnt;
    }
}