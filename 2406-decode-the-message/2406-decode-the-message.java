class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        int k=0;
        for(int i=0;i<key.length();i++){
            if(!hm.containsKey(key.charAt(i))&&key.charAt(i)!=' '){
                hm.put(key.charAt(i),(char)('a'+k));
                k++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' ')
            sb.append(' ');
            else
            sb.append(hm.get(message.charAt(i)));
        }
        return sb.toString();
    }
}