package MultThread;

public class safeThread
{
    private int tickets = 100;

    public int getTickets()
    {
        //同步代码块
        synchronized (this){//this表示锁对象,必须是唯一的
            if(this.tickets>0){
                try
                {
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                return tickets--;
            }else{
                return 0;
            }

        }

    }

    //同步方法
    public synchronized  void method(){
        //可能会产生线程安全问题的代码

    }
}
