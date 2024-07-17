package oopsinjava;

public class Student {           
String name;
int rno;
double percent;
final String schoolName="BBPS";
  private static int numberofStudents;


public Student()
{
}


public Student(String name,int rno,double percent ){
    this.name=name;
    this.rno=rno;
    this.percent=percent;
    numberofStudents++;


}
public static int getnumberofstudents(){
    return numberofStudents;
}
public int getRno()
{//getter
return rno;
}


public  void  setRno(int rno){//setter
    this.rno=rno;
}
}
