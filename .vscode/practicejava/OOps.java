

class pen{
    String colour;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
    class Students{
        String name;
        String age;
        public void printinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

    }
}

public class OOps {
    public static void main(String[] args) {
        // pen pen1=new pen();
        // pen1.colour="blue";
        // pen1.type="gel";
        // pen pen2=new pen();
        // pen2.colour="black";
        // pen2.type="ballpen";
        // pen1.printcolour();
        // pen2.printcolour();
        Student s1=new Student();
        s1.name="sanchay";
        s1.age="22";
        s1.printinfo();
       



    }
    
}
