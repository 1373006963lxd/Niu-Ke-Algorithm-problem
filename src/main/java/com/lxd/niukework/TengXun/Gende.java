package com.lxd.niukework.TengXun;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/26 0026 下午 15:38
 */
public class Gende {
    public static void main(String[] args) {
        int result = Gende.get();
        System.out.print(result);
    }
    public static int get(){
        Scanner sc = new Scanner(System.in);
        int Paicount = sc.nextInt();
        int[] arr = new int[Paicount];
        for(int i=0;i<Paicount;i++){
            arr[i] = sc.nextInt();
        }
        /*
        这里是从0开始排序最优解，所以是从大到小排序
        */
        for(int i=0;i<Paicount-1;i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        int niu = 0;
        int yang = 0;
        for(int i=0;i<Paicount;i++){
            /*
            这里是从0开始所以这里要注意
            */
            if(i%2==0){
                niu+=arr[i];
            }else{
                yang+=arr[i];
            }
        }
        return niu-yang;
    }
}
