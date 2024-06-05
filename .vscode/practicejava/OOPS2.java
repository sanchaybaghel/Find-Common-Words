class Student {
    String name;
    int age;
    public void getinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
    public class OOPS2 {
        public static void main(String args[]) {

           Student s2=new Student("Snc",22);
           s2.getinfo();
            // s1.name="sanchay";
            // s1.age=22;
            
            // Student s2=new Student();
            // s2.name="genius";
            // s2.age=21;
            // s2.getinfo();
            
        }
    }


 

