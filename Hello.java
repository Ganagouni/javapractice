public class Hello{

String name;
Hello(){
this.name="Hello world";
}
public static void main(String [] args){
Hello obj=new Hello();
System.out.println(obj.name);
//System.out.println(Hello.name);
}
}