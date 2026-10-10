import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        System.out.println("Numbers :"+numbers);
        System.out.println("Smallest :"+numbers.first());
        System.out.println("Largest :"+numbers.last());
        System.out.println("Greater than 20 :"+numbers.higher(20));
        System.out.println("Less then 40 :"+numbers.lower(40));
    }
}
