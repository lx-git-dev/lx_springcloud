public class eq {
    public static void main(String[] args) {
        phone p=new phone();
        phone p2=new phone();
        new Thread(()->{
            p.sendMS();
        },"t1").start();
        new Thread(()->{
            p2.sendMS();
        },"t2").start();
    }
}
class phone{

    public synchronized void sendMS(){
        if(Thread.currentThread().getName().equals("t1")){
            System.out.println(Thread.currentThread().getName()+"  name"+Thread.currentThread().getId());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+"  elsename"+Thread.currentThread().getId());
        }
    }
        }
