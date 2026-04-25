package newOOP;

class Student{
    private String name;
    private int id;

    public Student(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);  
        System.out.println("id: " + id);
    }
}

public class StudentMain{
    public static void main(String[] args) {
        Student student1 = new Student("Abdur Rahman", 121);

        student1.displayInfo();
        System.out.println(student1.getName());
        System.out.println(student1.getId());

        System.out.println("\nchanging by setter\n");
        student1.setName("kotha km bol");
        student1.setId(000);

        student1.displayInfo();
        System.out.println(student1.getName());
        System.out.println(student1.getId());
    }
} 




