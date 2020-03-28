package com.lxd.niukework.TengXun;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/26 0026 下午 16:13
 *
 * 注意nextInt和nextLine只能先用后者再用前者
 */
public class ScannerTest {
    public static void main(String[] args) {
        int result = ScannerTest.get();
        System.out.print(result);
    }
    public static int get(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] A = new int[split.length];
        for(int i=0;i<split.length;i++){
            A[i] = Integer.parseInt(split[i]);
        }
         /*
        这里是从0开始排序最优解，所以是从大到小排序
        */
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]){
                int temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            }
        }
        int niu = 0;
        int yang = 0;
        for(int i=0;i<A.length;i++){
            /*
            这里是从0开始所以这里要注意
            */
            if(i%2==0){
                niu+=A[i];
            }else{
                yang+=A[i];
            }
        }
        return niu-yang;
    }
    }
