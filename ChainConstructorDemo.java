class ChainConstructorDemo{

public String empName;
public int empSalary;
public String empLocation;

ChainConstructorDemo(){
	// invokes constructor with  string parameter
this("sai");
}
ChainConstructorDemo(String name){
	//invoked constructor with string and int parameter
this(name, 1234);
}
ChainConstructorDemo(String name, int salary){
	// invokes parameter with string,int and  string parameter
this(name,salary,"Hyd");
}
ChainConstructorDemo(String name,int salary,String addr){
this.empName=name;
this.empSalary=salary;
this.empLocation=addr;
}
void display(){
System.out.println("Employee Name:"+empName);
System.out.println("Employee Salary:"+empSalary);
System.out.println("Employee Loction:"+empLocation);
}
public static void main(String[] args)
{
ChainConstructorDemo obj=new ChainConstructorDemo();
obj.display();

}
}