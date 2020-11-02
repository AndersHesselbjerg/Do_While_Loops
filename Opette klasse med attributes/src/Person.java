    public class Person {
    String firstname = "Anders";
    String lastname = "Hesselbjerg";
    int age = 28;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: " + myObj.firstname + " " + myObj.lastname);
        System.out.println("Age: " + myObj.age);
    }
}