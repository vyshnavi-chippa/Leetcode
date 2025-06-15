class Solution {
    public int maxDiff(int num) {
        String s=String.valueOf(num);
        char ch1[]=s.toCharArray();
        char ch2[]=s.toCharArray();
        char f1=ch1[0];
        char f2=ch2[0];
        if(f1=='9'){
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!='9')
                {
                    f1=ch1[i];
                    break;
                }
            }
        }
        char f3='0';
        if(f2=='1'){
            for(int i=0;i<ch2.length;i++){
                if(ch2[i]!='0'&&ch2[i]!='1')
                {
                    f3=ch2[i];
                    break;
                }
            }
        }
      //  if(f2=='1')f2='0';
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==f1)
            ch1[i]='9';
            if(f2=='1'){
                if(ch2[i]==f3)
                ch2[i]='0';
            }
            else{
                if(ch2[i]==f2)
                ch2[i]='1';
            }
            // else if(ch2[i]==f2)
            // ch2[i]='1';
        }
        String s1=new String(ch1);
        int num1=Integer.parseInt(s1);
        String s2=new String(ch2);
        int num2=Integer.parseInt(s2);
        if(num2==0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<ch1.length;i++)
            sb.append('1');
            num2=Integer.parseInt(sb.toString());
        }

        System.out.println(num1+" "+num2);

        return num1-num2;
    }
}