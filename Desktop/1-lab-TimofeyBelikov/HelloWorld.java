public class HelloWorld{
    public static void main(String[] args){

        Student vasya = new Student("Василий");
        Student petya = new Student ( name: "Петя",age: 18 );

        Student[] students = {vasya, petya};

        for (Student student: students)

            System.out.println(student);
    }
}

class Student{
    public String name;
    public int age;
    public boolean isLazy;

    public Student(String name){
        this.name=name;
        age=20;
        isLazy=true;
    }

    public String toString(){

        return  name+ ", " + age+ "y.o" ;
    }
}