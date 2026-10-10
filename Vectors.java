import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
        Vector<Integer>numbers=new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println("First:"+numbers.get(0));
        numbers.set(1,50);
        System.out.println(numbers);
        System.out.println("First: "+numbers.get(0));
        numbers.set(1,50);
        System.out.println("After set: "+numbers);
        numbers.remove(2);
        System.out.println("After remove:"+numbers);
        System.out.println("Size: "+numbers.size());
    }
}
