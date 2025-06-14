class Solution {
    public int minMaxDifference(int num) {
        String s=Integer.toString(num);
        char ch1[]=s.toCharArray();
        char ch2[]=s.toCharArray();
        char f=ch1[0];
        char f2=ch2[0];
        if(f=='9'){
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!='9'){
                    f=ch1[i];
                    break;
                }
            }
        }
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==f){
            ch1[i]='9';}
            if(ch2[i]==f2)
            ch2[i]='0';
        }
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        String s1=new String(ch1);
        String s2=new String(ch2);
        int val1=Integer.parseInt(s1);
        int val2=Integer.parseInt(s2);
    return val1-val2;
    }
}