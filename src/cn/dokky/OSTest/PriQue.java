package cn.dokky.OSTest;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriQue {

    // 成员变量
    private PriorityQueue<PCB> waitingQueue;
    private LinkedList<PCB> finishedQueue;

    // 构造函数
    public PriQue()
    {
        waitingQueue = new PriorityQueue<PCB>(10,
                (p1, p2) -> (p2.getPriority() - p1.getPriority()));
        finishedQueue = new LinkedList<PCB>();
        waitingQueue.add(new PCB(0, 7, 15, 0, 'W'));
        waitingQueue.add(new PCB(1, 3, 7, 0, 'W'));
        waitingQueue.add(new PCB(2, 4, 6, 0, 'W'));
        waitingQueue.add(new PCB(3, 2, 4, 0, 'W'));
        waitingQueue.add(new PCB(4, 1, 8, 0, 'W'));
        waitingQueue.add(new PCB(5, 8, 8, 0, 'W'));
        waitingQueue.add(new PCB(6, 5, 12, 0, 'W'));
    }
    // 成员函数

    public PCB pop()
    // 取waitingQueue的队头元素
    {
        return waitingQueue.poll();
    }
    public int size()
    // 返回waitingQueue的进程个数
    {
        return waitingQueue.size();
    }
    public void insert(PCB pcb)
    //把元素插入到合适位置
    {
        if(pcb.isFinished())
            finishedQueue.add(pcb);
        else
            waitingQueue.add(pcb);
        check();
    }
    private void check()
    // 每次insert后进行check 修改状态：队头设置为Running 其余设置为Waiting
    {
        for(PCB p : waitingQueue)
            p.setState('W');

        waitingQueue.peek().setState('R');

        for (PCB p : finishedQueue)
            p.setState('F');

    }


    public void print()
    // 打印当前队列
    {
//        System.out.println("the first guy: " + waitingQueue.peek().getName());
        // 首先打一行线
        System.out.println("==================================================");

        // 然后打印表头
        System.out.println("ID\t\tPRIORITY\tCPUTIME\t\tALLTIME\t\tSTATE");
        for (PCB p : waitingQueue)
            System.out.println("" + p.getName() + "\t\t"
                                  + p.getPriority() + "\t\t\t"
                                  + p.getCpu_time() + "\t\t\t"
                                  + p.getTotal_time() + "\t\t\t"
                                  + p.getState()
            );

        for (PCB p : finishedQueue)
            System.out.println("" + p.getName() + "\t\t"
                    + p.getPriority() + "\t\t\t"
                    + p.getCpu_time() + "\t\t\t"
                    + p.getTotal_time() + "\t\t\t"
                    + p.getState()
            );


        // 最后再打一行线
        System.out.println("==================================================");
    }
}
