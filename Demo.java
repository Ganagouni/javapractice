import java.util.Scanner;

class Demo{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int num=scan.nextInt();
scan.close();
System.out.println("The Entered number is"+" "+num);
}
}