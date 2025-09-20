class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0;
        for(int i=0;i<nums1.length;i++){
            boolean f=true;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(f){c++;f=false;}
                }
            }
        }
        int c1=0;
        for(int i=0;i<nums2.length;i++){
            boolean f=true;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    if(f){c1++;f=false;}
                }
            }
        }
        int a[]=new int[2];
        a[0]=c;
        a[1]=c1;
        return a;
    }
}