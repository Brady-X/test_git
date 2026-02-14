// 定义包名，与目录结构对应
package com.example;

/**
 * 最小化Java项目的主类
 */
public class f1_pj{
    // 程序入口方法（main方法是Java程序的执行起点）
    public static void main(String[] args) {
        // 输出欢迎信息
        System.out.println("Hello, Tiny Java Project!");
        // 演示接收命令行参数
        if (args.length > 0) {
            System.out.println("你传入的参数是: " + String.join(", ", args));
        }
    }
}