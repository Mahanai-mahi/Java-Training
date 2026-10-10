import java.util.*;
public class Comparators {
    public static void main(String[] args){
        List<Integer> nums=Arrays.asList(5,2,9,1);
        Collections.sort(nums,new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
        return b-a;
    }});
   System.out.println(nums);
   nums.sort((a,b)->a-b);
   System.out.println(nums);
}


}



