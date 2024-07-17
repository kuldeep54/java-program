package School;

public class SchoolClass {

    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student("John Doe", 101, 95.5);
        Student student2 = new Student("Jane Doe", 102, 88.0);

        // Displaying details of students
        student1.displayDetails();
        System.out.println(); // Adding a newline for better readability
        student2.displayDetails();
}

}
