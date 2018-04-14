package MultThread;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class namelessRunnable
{
    public static void main(String [] args){
        Runnable r=new Runnable()
        {
            @Override
            public void run()
            {
                for(int x=0;x<40;x++){
                    System.out.println(Thread.currentThread().getName()+"...Y...."+x);
                }
            }
        };//匿名内部类的方式创建
        new Thread(r).start();
    }
}
