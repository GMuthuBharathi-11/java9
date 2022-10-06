 import java.util.Objects;

    record Student(String name, int id, int age)
    {
        static int count=0;
        static void incrementCount()
        {
            count++;
        }
        Student{
            Objects.requireNonNull(name);
            Objects.requireNonNull(id);
            Objects.requireNonNull(age);
            incrementCount();
        }
    }
 public class Q11
 {
        public static void main(String[] args) {
            Student s1=new Student("Muthu",1,23);
            Student s2=new Student("Sandhya",2,24);
            Student s3=new Student("Sri haran",3,25);
            Student s4=new Student("Mohana",1,23);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println("Are  the Student 1 and Student 4 equal?");
            System.out.println(s1.equals(s4));
            System.out.println(" The number of students created: ");
            System.out.println(Student.count);
        }
    }
