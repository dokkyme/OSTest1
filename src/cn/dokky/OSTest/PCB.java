package cn.dokky.OSTest;


public class PCB
{
    private int name;       //进程名
    private int priority;    //优先数
    private int total_time;  //进程需要运行的时间
    private int cpu_time;    //已经占用CPU的时间
    private char state;     //进程的状态 R(run运行) W(Wait等待) F(Finish完成)



    public PCB()
    {
        this.name = 0;
        this.priority = 0;
        this.total_time = 0;
        this.cpu_time = 0;
        this.state = 'R';
    }
    public PCB(int name, int priority, int total_time, int cpu_time, char state)
    {
        this.name = name;
        this.priority = priority;
        this.total_time = total_time;
        this.cpu_time = cpu_time;
        this.state = state;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getTotal_time() {
        return total_time;
    }

    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }

    public int getCpu_time() {
        return cpu_time;
    }

    public void setCpu_time(int cpu_time) {
        this.cpu_time = cpu_time;
    }

    public char getState() {
        return state;
    }

    public void setState(char status) {
        this.state = status;
    }

    public boolean isFinished()
    {
        return this.total_time == this.cpu_time;
    }

}
