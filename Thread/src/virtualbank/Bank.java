package virtualbank;



class MyClass1{
    public synchronized  void show1(){
        System.out.println("is show1()");
    }
}
class MyClass2{
    public synchronized  void show2(){
        System.out.println("is show2()");
    }
}

class MyThread1 extends  Thread{
    private MyClass1 c1;
    private MyClass2 c2;

    public MyThread1(MyClass1 c1,MyClass2 c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public void run(){
        synchronized (c1){//锁住对象c1
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //醒来后
            System.out.println("线程1醒来,准备访问c2.show()....");
            c2.show2();
        }
    }
}

class MyThread2 extends Thread{
    private MyClass1 c1;
    private MyClass2 c2;

    public MyThread2(MyClass1 c1,MyClass2 c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public void run(){
        synchronized (c2){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("线程2醒来,准备访问c1.show()....");
            c1.show1();
        }

    }


}
public class Bank
{
    public static void main(String[] args){
        MyClass1 c1=new MyClass1();
        MyClass2 c2=new MyClass2();
        MyThread1 t1=new MyThread1(c1,c2);
        MyThread2 t2=new MyThread2(c1,c2);

        t1.start();
        t2.start();
    }
}
