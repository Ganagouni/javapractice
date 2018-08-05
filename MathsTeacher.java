class Teacher{
String designation="Teacher";
String college="Dump";
void dose(){
System.out.println("Teching");
}
}

public class MathsTeacher extends Teacher{
String mainSubject="Maths";
public static void main(String[] args){
MathsTeacher obj= new MathsTeacher();
System.out.println(obj.designation);
System.out.println(obj.college);
System.out.println(obj.mainSubject);
obj.dose();
}
}