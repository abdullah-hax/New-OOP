package newOOP;

class Student{
    private String name;
    private int age;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentMain{
    public static void main(String[] args) {
        Student student1 = new Student("Abdur Rahman", 21);

        student1.displayInfo();

        student1.setAge(31);
        student1.displayInfo();
    }
} 




