import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)throws InterruptedException{
        ArrayList<Integer>list=new ArrayList<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                list.add(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Size: "+list.size());
    }
}
