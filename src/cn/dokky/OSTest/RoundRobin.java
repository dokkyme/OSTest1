package cn.dokky.OSTest;

public class RoundRobin
{
    RoundQue queue = new RoundQue();
    public void roundSort()
    {
        while(queue.size()!=0)
        {

            queue.print();

            PCB pcb = queue.pop();
            pcb.setCpu_time(Math.min(pcb.getCpu_time() + pcb.getPriority(),pcb.getTotal_time()));

            queue.insert(pcb);

        }
        queue.print();
    }
}
