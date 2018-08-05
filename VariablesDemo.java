import java.util.Scanner;
class VariablesDemo{
public static String var1="This is static variable";
public String var2="This is instance variable";

public void methodClass(){
String var3="This is local variable";
System.out.println(var3);
}
public static void main(String [] args){
VariablesDemo d1=new VariablesDemo();
System.out.println(d1.var1);
System.out.println(var1);
System.out.println(d1.var2);
d1.methodClass();
}
}