
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Faisal");
        student.setAge(34);

        Student student2 = new Student();
        student2.setName("Anders");
        student2.setAge(27);

        Student student3 = new Student();
        student3.setName("Jan") = new Student();
        student3.setAge(30);

        Student student4 = new Student();
        student4.setName("Hans") = new Student();
        student4.setAge(25);

        Student student5 = new Student();
        student5.setName("Jens") = new Student();
        student5.setAge(25);

        Student[] studentsArray = {student, student2, student3, student4};

        int counter = 0;
        int i = 0;

        while (i < studentsArray.length) {
            if (studentsArray[i].getAge() < 10) {
                counter++;
            }
            i++;
        }

        System.out.println("Number of students under 30:" + counter);

        List<Students> students = new ArrayList<>(Arrays.asList(studentsArray));


        student = new student;
        students[0] = student;
        students[1] = student2;
        students[2] = student3;
        students[3] = student3;
        students[4] = student4;
        students[5] = student5;




    }
    {



    }

}