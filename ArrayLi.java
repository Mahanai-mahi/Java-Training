import java.util.*;
public class ArrayLi{
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("Mahanai");
        students.add("Lasya");
        students.add("Moni");
        students.add("Mahathi");
        System.out.println("Students: "+students);
         System.out.println(" First Student: "+students.get(0));
         students.set(1,"Mahanai");
         System.out.println("After Updating: "+students);
         students.remove("Moni");
         System.out.println("Updated list after removing :"+students);
        }
}
