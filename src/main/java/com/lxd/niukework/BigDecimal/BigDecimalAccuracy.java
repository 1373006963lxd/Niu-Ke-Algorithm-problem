package com.lxd.niukework.BigDecimal;

import java.math.BigDecimal;
import java.util.Objects;

public class BigDecimalAccuracy {
    /*
* 为什么浮点数 float 或 double 运算的时候会有精度丢失的风险呢？
这个和计算机保存浮点数的机制有很大关系。我们知道计算机是二进制的，而且计算机在表示一个数字时，宽度是有限的，
* 无限循环的小数存储在计算机时，只能被截断，所以就会导致小数精度发生损失的情况。
* 这也就是解释了为什么浮点数没有办法用二进制精确表示。
* // 0.2 转换为二进制数的过程为，不断乘以 2，直到不存在小数为止，
// 在这个计算过程中，得到的整数部分从上到下排列就是二进制的结果。
0.2 * 2 = 0.4 -> 0
0.4 * 2 = 0.8 -> 0
0.8 * 2 = 1.6 -> 1
0.6 * 2 = 1.2 -> 1
0.2 * 2 = 0.4 -> 0（发生循环）
...
      *
      * */

    public static void main(String[] args) {


        //浮点数之间的等值判断，基本数据类型不能用==来比较
        System.out.println("浮点数之间的等值判断，基本数据类型不能用==来比较");
        float a = 1.0f;
        System.out.println(a);//1.0
        float b = 0.9f;
        System.out.println(b);//0.9
        float c = 0.8f;
        System.out.println(c);//0.8
        float a_b = a-b;//0.100000024
        System.out.println(a_b);
        float b_c = b-c;//0.099999964
        System.out.println(b_c);
        System.out.println(a_b==b_c);//false
        System.out.println("浮点数之间的等值判断，基本数据类型可用==来比较的情况");
        float d = 1.0f-0.5f;
        System.out.println(d);
        float e = 1.5f-1.0f;
        System.out.println(e);
        System.out.println(d==e);
       // 浮点数之间的等值判断，包装数据类型不能用 equals 来判断。
        System.out.println("浮点数之间的等值判断，包装数据类型不能用 equals 来判断。");
        Float x = Float.valueOf(a_b);
        System.out.println(x);
        Float y = Float.valueOf(b_c);
        System.out.println(y);
        System.out.println(x.equals(y));

        //想要解决这个问题也很简单，直接使用 BigDecimal 来定义浮点数的值，再进行浮点数的运算操作即可。
        System.out.println("使用 BigDecimal解决这个问题 ");
        BigDecimal a1 = new BigDecimal("1.0");
        BigDecimal b1 = new BigDecimal("0.9");
        BigDecimal c1 = new BigDecimal("0.8");
        BigDecimal x1 = a1.subtract(b1);
        BigDecimal y1 = b1.subtract(c1);
        System.out.println(x1); /* 0.1 */
        System.out.println(y1); /* 0.1 */
        System.out.println(Objects.equals(x1, y1)); /* true */
        //使用compareTo比较
        System.out.println("使用compareTo比较");
        if(x1.compareTo(y1)==0){
            System.out.println("true");
        }

        //使用截取方式解决问题
        System.out.println("使用截取方式解决问题");
        float diff = 1e-6F;
        if(Math.abs(a_b-b_c)<diff){
            System.out.println("true");
        }

        //在使用 BigDecimal 时，为了防止精度丢失，
        //推荐使用它的BigDecimal(String val)构造方法或者 BigDecimal.valueOf(double val) 静态方法来创建对象。
        System.out.println("使用BigDecimal（double）存在精度风险");
        BigDecimal g = new BigDecimal(0.1f);
        System.out.println(g);
        System.out.println("用它的BigDecimal(String val)");
        BigDecimal h = new BigDecimal("0.1");
        System.out.println(h);
        System.out.println("用它的BigDecimal.valueOf(double val) ");
        BigDecimal h1 = BigDecimal.valueOf(0.1);
        System.out.println(h1);
    }
}
