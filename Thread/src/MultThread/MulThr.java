package MultThread;

class MyThread extends Thread{
    MyThread(){

    }
    MyThread(String name){
        super(name);
    }
    //复写run方法
    @Override
   public void run(){
       for(int i=1;i<=20;i++){
           System.out.println(Thread.currentThread().getName()+",i="+i);
       }
    }
}
public class MulThr
{
    public static void main(String[] args){
        //创建两个线程任务
        MyThread myThreadone=new MyThread();
        MyThread myThreadtwo=new MyThread();
        myThreadone.run();//没有开启新线程,主线程中调用run方法
        myThreadtwo.start();//开启一个新线程,新线程调用run方法
    }
}
