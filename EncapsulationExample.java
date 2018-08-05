class Employees{

private int numOfEmployess=0;

public void setNumOfEmployees(int count)
{
	NumOfEmployees=count;
}
public double getNumOfEmployees()
{
	return numOfEmployees;
}
}
public class EncapsulationExample{
public static void main (String [] args)
{
	Employees emp= new Employees();
	emp.setNumOfEMployees(12345);
	System.out.println("Number of Employees are: "emp.getNumOfEmployees());
}
}
