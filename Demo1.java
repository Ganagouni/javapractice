import java.util.Scanner;
class Demo1{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
System.out.print("Enter an number:");
int num=scan.nextInt();
scan.close();
if(num>0)
{
System.out.println("The entered number is positive"+" "+num);
}
else if(num<0)
{
System.out.println("The Entered number is negative"+" "+num);
}
else
{
System.out.println(num+"Number entered is   neither positive nor negeative");

}
}
}