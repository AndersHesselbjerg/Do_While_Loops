import java.util.ArrayList;

public class TestStudent {

        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            Student student = new Student();
            student.setFirstName("Faisal");
            student.setLastName("Jarkass");
            student.setAge(33);
            student.setAdress("Ghooleej 13");
            student.setCpr("05071968");
            student.setMail("halo.@kea.stud.dk");
            student.setStudentId(123);

            ArrayList<String> courses = new ArrayList<>();
            courses.add("SWC1");
            courses.add("SWC1");
            courses.add("SWC1");
            student.setCourses(courses);

            Student student2 = new Student("Faisal", "Jarkass", "121298",33,"fafs@kea2.dk",123,"Ravnevej",courses);

            students.add(student);
            students.add(student2);

            System.out.println(student.toString());
            System.out.println(student2.toString());
            System.out.println(students.toString());

            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }

        }
}
