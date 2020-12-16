package cn.dokky.OSTest;

public class Priority
{
    PriQue queue = new PriQue();
    public void prioritySort()
    {
        while(queue.size()!=0)
        {

            queue.print();

            PCB pcb = queue.pop();
            pcb.setCpu_time(pcb.getCpu_time() + 1);
            pcb.setPriority(Math.max(pcb.getPriority() - 3, 0));

            queue.insert(pcb);

        }
    }
}
