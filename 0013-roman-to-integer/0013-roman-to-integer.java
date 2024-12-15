class Solution {
    public int romanToInt(String s) {
        char ch[]=s.toCharArray();
        int n=s.length();
        int sum=0,i;
        for(i=0;i<n-1;i++){
            if(ch[i]=='I'&&ch[i+1]=='V'){
                sum=sum+4;
                i++;
            }
            else if(ch[i]=='I'&&ch[i+1]=='X'){
                sum=sum+9;
                i++;
            }
            else if(ch[i]=='X'&&ch[i+1]=='L'){
                sum=sum+40;
                i++;
            }
            else if(ch[i]=='X'&&ch[i+1]=='C'){
                sum=sum+90;
                i++;
            }
            else if(ch[i]=='C'&&ch[i+1]=='D'){
                sum=sum+400;
                i++;
            }
            else if(ch[i]=='C'&&ch[i+1]=='M'){
                sum=sum+900;
                i++;
            }
            else if(ch[i]=='I'){
                sum=sum+1;
            }
            else if(ch[i]=='V')
            sum=sum+5;
            else if(ch[i]=='X')
            sum=sum+10;
            else if(ch[i]=='L')
            sum=sum+50;
            else if(ch[i]=='C')
            sum=sum+100;
            else if(ch[i]=='D')
            sum=sum+500;
            else if(ch[i]=='M')
            sum=sum+1000;
            
        }
        if(i==n)
        return sum;
        else{
             if(ch[n-1]=='I'){
                sum=sum+1;
            }
            else if(ch[n-1]=='V')
            sum=sum+5;
            else if(ch[n-1]=='X')
            sum=sum+10;
            else if(ch[n-1]=='L')
            sum=sum+50;
            else if(ch[n-1]=='C')
            sum=sum+100;
            else if(ch[n-1]=='D')
            sum=sum+500;
            else if(ch[n-1]=='M')
            sum=sum+1000;
        }
        return sum;
        
    }
}