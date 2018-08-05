class Employees{

private int NumOfEmployees=0;

public void setNumOfEmployees(int count)
{
	NumOfEmployees=count;
}
public double getNumOfEmployees()
{
	return NumOfEmployees;
}
}
public class EncapsulationExample{
public static void main (String [] args)
{
	Employees emp= new Employees();
	emp.setNumOfEmployees(12345);
	System.out.println("Number of Employees are: "+emp.getNumOfEmployees());
}
}
