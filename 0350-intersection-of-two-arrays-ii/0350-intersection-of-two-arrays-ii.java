class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
                if(nums1[i]==nums2[j]){
                al.add(nums1[i]);
                i++;j++;}
                else if(nums1[i]>nums2[j]){
                    j++;
                }
                else
                i++;
            
        }
        int arr[]=new int[al.size()];
        for(int k=0;k<al.size();k++)
        arr[k]=al.get(k);
        return arr;
    }
}