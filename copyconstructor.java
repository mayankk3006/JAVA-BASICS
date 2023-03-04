public class copyconstructor {
    public static void main(String[] args) {
        Student s1=new Student(); 
        s1.name="Mayank";
        s1.roll=123;
        s1.password="abcd";
        Student s2=new Student(s1);
        s2.password="xyz";
        System.out.println(s2.password);
        Student s3=new Student(s1.name);
        Student s4=new Student(s1.roll);
        

    }

    
}

class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        System.out.println(name);
        System.out.println(roll);
        this.password=s1.password;
        System.out.println(password);
    }
   

    Student(){
        System.out.println("constructor is called");
    }

    Student(String name){
        this.name=name;
        System.out.println(name);
    }

    Student(int roll){
        this.roll=roll;
        System.out.println(roll);
    }

}