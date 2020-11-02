public class Student {import java.util.ArrayList;

    public class Student {

        private String firstName;
        private String lastName;
        private String cpr;
        private int age;
        private String mail;
        private int studentId;
        private String adress;
        private ArrayList<String> courses;

        public Student() {
            courses = new ArrayList<>();
        }

        public Student(String firstName, String lastName, String cpr, int age, String mail, int studentId, String adress, ArrayList<String> courses) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.cpr = cpr;
            this.age = age;
            this.mail = mail;
            this.studentId = studentId;
            this.adress = adress;
            this.courses = courses;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCpr() {
            return cpr;
        }

        public void setCpr(String cpr) {
            this.cpr = cpr;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public ArrayList<String> getCourses() {
            return courses;
        }

        public void setCourses(ArrayList<String> courses) {
            this.courses = courses;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", cpr='" + cpr + '\'' +
                    ", age=" + age +
                    ", mail='" + mail + '\'' +
                    ", studenID=" + studentId + '\'' +
                    ", adress='" + adress + '\'' +
                    ", courses=" + courses +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            return studentId == student.studentId;
        }

        @Override
        public int hashCode() {
            return studentId;
        }
    }





}
