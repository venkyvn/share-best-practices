package main.java.org.share.practices.numercal.mathematics;

import java.util.Scanner;

/**
 * ** created by DawnSailing at 2020/3/8
 *
 * @author DawnSailing
 */
public class CubeRootTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = get(n);
        System.out.println(String.format("%.1f",m));
    }

    /**
     * 牛顿迭代思想: x = (2*x + y/x/x)/3;
     * @param n
     * @return
     */
    public static double get(double n){
        double a, b;
        a = n;
        if(n == 0){
            return 0;
        }
        // 利用迭代法进行求解 -- 牛顿迭代法
        b = (2 * a + n / a / a) / 3;
        // Math.abs(x)返回指定数字x的绝对值
        while(Math.abs(b - a) > 0.000001){
            a = b;
            b = (2 * a + n / a / a) / 3;
        }
        return b;
    }

}
