package MultThread;

public class Difference
{
    public static void main(String[] args ){
      /*  new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();*///创建了4个独立的TicketWindows对象
        TicketWindow tk=new TicketWindow();
        new Thread(tk,"窗口1").start();
        new Thread(tk,"窗口2").start();
        new Thread(tk,"窗口3").start();
        new Thread(tk,"窗口4").start();
    }
    static class TicketWindow implements Runnable{
        private int tickets=100;
        @Override
        public void run(){
            while(true){
                if(tickets>0){
                    Thread thread=Thread.currentThread();
                    String th_name=thread.getName();
                    System.out.println(th_name+"正在发售第"+tickets--+"张票");
                }else{
                    break;
                }
            }
        }




    }
}
