class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> al=new ArrayList<>();
        int i=0;
        for(String s:words){
            if(s.contains(Character.toString(x))){
                al.add(i);
            }
            i++;
        }
        return al;
    }
}