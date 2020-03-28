package com.lxd.niukework.HengSheng;

/**
 * @auther li xiao dong
 * @date 2020/3/24 0024 上午 8:26
 */
public class WanShu {
    public static void main(String[] args){
        for(int i = 1;i<1000;i++){
            int sum = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j == 0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
