package com.lxd.niukework.StringTest;

public class ReplaceSpace {
   /* public String replaceSpace(StringBuffer str) {
        int len = str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' '){
                //insert方法是在当前i的位置插入新值，将原来位置的值后移
                str.insert(i,'%');
            }
        }
        return str.toString().replaceAll(" ", "%20");
    }*/
   public String replaceSpace(StringBuffer str) {
       StringBuffer s = new StringBuffer();
       int len = str.length();
       for(int i=0;i<len;i++){
           if(str.charAt(i)!=' '){
               s.append(str.charAt(i));
           }else{
               /*参数类型字符串*/
               s.append("%20");
           }
       }
       return s.toString();
   }

    public static void main(String[] args) {
        ReplaceSpace r = new ReplaceSpace();
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        System.out.print(r.replaceSpace(stringBuffer));
    }
}
