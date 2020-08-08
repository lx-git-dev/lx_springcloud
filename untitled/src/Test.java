import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    //        public static void main(String args[]){
//            int n=0;
//            double sum=0,a=1,b=1;
//            for(int i=1;i<=5;i++){
//                if(i%2!=0){
//                    if(n%2==0){
//                        sum=sum+a;
//                        n=n+1;
//                    }
//                    else{
//                        sum=sum-a;
//                        n=n+1;
//                    }
//                    a=1/(b+2);
//                    b=b+2;
//                }
//
//            }
//            System.out.println("合为:"+sum);
//        }
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService cachedThreadPool2 = Executors.newFixedThreadPool(2);
        ExecutorService cachedThreadPool3 = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool4 = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }
}
