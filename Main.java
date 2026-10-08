class Student{
  
        private String name ;
        int age=20;
        public String getName(){
        return name;
    }
   

public void setName(String name){
    this.name=name;
}
void display(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
}
}
public class Main{
    public static void main(String[] args){
        Student s = new Student();
       
        s.getName();
        s.setName("Mahi");
         s.display();

    }

}
