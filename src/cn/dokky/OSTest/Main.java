package cn.dokky.OSTest;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
	// write your code here
       System.out.print("请选择选择一种调度算法：1.优先数排序调度  2.简单轮转法：");
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type)
        {
            case 1:
                Priority p = new Priority();
                p.prioritySort();
                break;
            case 2:
                RoundRobin r = new RoundRobin();
                r.roundSort();
                break;
        }

    }
}
