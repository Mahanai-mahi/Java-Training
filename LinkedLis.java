import java.util.LinkedList;
public class LinkedLis {
    public static void main(String[] args){
        LinkedList<String>students=new LinkedList<>();
        students.add("Rahul");
        students.add("Anu");
        students.add("kiran");
        System.out.println(students);
        students.addFirst("Hemanth");
        students.addLast("Ravi");
        System.out.println(students);
        System.out.println("First: "+students.getFirst());
        System.out.println("Last: "+students.getLast());
        students.removeFirst();
        students.removeLast();
        System.out.println(students);
    }
}
