package MultThread;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class nameless
{
    public static void main(String[] args){

        System.out.println(Thread.currentThread().getName());
        new Thread(){
            public void run(){
                for(int x=0;x<40;x++){
                    System.out.println(Thread.currentThread().getName()+"xxx"+x);
                }
            }
        }.start();
    }
}
