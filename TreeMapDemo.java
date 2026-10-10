import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String>students=new TreeMap<>();
        students.put(103,"Kiran");
        students.put(103,"Rahul");
        students.put(103,"Anu");
        students.put(103,"Ravi");
        System.out.println("Map:"+students);
        System.out.println("Student 102: "+students.get(102));
          System.out.println("Size: "+students.size());
            System.out.println("Contains key 103: "+students.containsKey(103));
             System.out.println("Contains key Anu: "+students.containsValue("Anu"));
            students.put(102,"Ananya");
              System.out.println("After updating: "+students);
              System.out.println("\nUsing KeySet():");
              for(Integer key:students.keySet()){
                System.out.println(key+"->"+students.get(key));
              }
              System.out.println("\nUsing entryset():");
              for(Map.Entry<Integer,String>entry:students.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
              }


    }
}
