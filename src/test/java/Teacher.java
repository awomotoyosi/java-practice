import java.util.ArrayList;

public class Teacher {

    public String name;

    public String id;

    ArrayList<Student> students = new ArrayList<Student>(100);

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;

    }


    public static void main(String[] args) {
        Teacher firstTeacher = new Teacher("Temitope Williams", "101");
        Teacher secondTeacher = new Teacher("Temitayo Oloyin", "101");

        firstTeacher.addStudent("Toby Jackson", "103");
        firstTeacher.addStudent("KEMI Wasere", "104");
        firstTeacher.addStudent("TAYO Dialo", "105");

        secondTeacher.addStudent("Toyosi Brown", "001");
        System.out.println("List of students:");
        firstTeacher.printDetails();
      secondTeacher.printDetails();



    }

    public void printDetails() {


        System.out.println("-".repeat(30));
        System.out.println("Teacher: "+name);
        int i = 1;
        for (Student student : students) {
            System.out.println(i + ":" + student.name + " " + "ID" + student.id);
            i++;
        }
    }

    public Student findStudent(String name) {

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {


                return student;
            }



        }
        return null;
    }

    public void addStudent(String name, String id) {

        if (findStudent(name) == null) {
            Student students = new Student(name, id);
            this.students.add(students);


        }
    }

    class Student {

        private String name;

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        private String id;

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }
}