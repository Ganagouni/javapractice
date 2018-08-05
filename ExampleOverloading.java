class DisplayOverloading{
public void disc(char c,float d){
System.out.println(c+" "+d);
}
public void disc(char c,int a){
System.out.println(c +" "+ a);
}
}

public class ExampleOverloading{

public  static void main(String[] args){
DisplayOverloading obj=new DisplayOverloading();
obj.disc('a', 10.5f);
obj.disc('a',10);
}
}