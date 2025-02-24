class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0,p2=0,i=0;
        int temp[]=new int[n+m];
        while(p1<m&&p2<n){
            if(nums1[p1]<nums2[p2]){
            temp[i]=nums1[p1];
            p1++;i++;}
            else{
                temp[i]=nums2[p2];
                p2++;i++;
            }
        }
        while(p1<m){
            temp[i]=nums1[p1];
            p1++;i++;
        }
        while(p2<n){
            temp[i]=nums2[p2];
            p2++;i++;
        }
        for(int k=0;k<temp.length;k++){
            nums1[k]=temp[k];
        }
    }
}