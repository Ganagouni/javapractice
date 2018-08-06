class ConstructorOverloadingDemo{

private String sName;
private int sAge;

ConstructorOverloadingDemo(){
sName="sai";
sAge=26;
}
ConstructorOverloadingDemo(String name,int age){
sName=name;
sAge=age;
}
public String getsName(){
return sName;
}
public void setsName(String sName){
this.sName=sName;
}
public int getsAge(){
return sAge;
}
public void setsAge(int sAge){
this.sAge=sAge;
}

public static void  main (String [] args){

ConstructorOverloadingDemo obj=new ConstructorOverloadingDemo();
System.out.println("Student Name is: "+obj.getsName());
System.out.println("Student Name is: "+obj.getsAge());


ConstructorOverloadingDemo obj1=new ConstructorOverloadingDemo("prakash",27);
System.out.println("Student Name is: "+obj1.getsName());
System.out.println("Student Name is: "+obj1.getsAge());
}
}