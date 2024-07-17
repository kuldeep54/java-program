package oopsinjava;

public class StudentClass {

    //creating a new data type
    public static void change(Student s)
    {
        s.name="kuldeep";
    }
    public static void main(String[] args) {
        Student s1=new Student("k",76,86.9);
        Student s2=new Student("ku",78,87.9);
Student s3=new Student("kul",79,88.9);
        // s1.percent=86.6;
        // s1.name="malviya";
        // s1.rno=76;
        System.out.println(Student.getnumberofstudents());
        System.out.println(s1.getnumberofstudents());
         System.out.println(s2.getnumberofstudents());
          System.out.println(s3.getnumberofstudents());
        
        
        
        
    
     
    }
}
