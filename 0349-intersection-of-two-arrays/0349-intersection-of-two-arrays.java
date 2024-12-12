class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int i:nums1)
        s1.add(i);
        Set<Integer> s2=new HashSet<>();
        for(int i:nums2)
        s2.add(i);
        List<Integer> l1=new ArrayList<>(s1);
        List<Integer> l2=new ArrayList<>(s2);
        List<Integer> l3=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l2.size();j++){
                if(l1.get(i).equals(l2.get(j)))
                l3.add(l1.get(i));
            }
        }
        int a[]=new int[l3.size()];
        for(int i=0;i<l3.size();i++)
        a[i]=l3.get(i);
        return a;
    }
}