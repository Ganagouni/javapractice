class ConstructorDemo{

ConstructorDemo(){
System.out.println("No rgument Constructor");
}
ConstructorDemo(int i, int j){
System.out.println("Two argument Constructor");
}
ConstructorDemo(int a, String b){
System.out.println("Int and String argument Constructor");
}

public static void main(String [] args){
ConstructorDemo obj=new ConstructorDemo();
ConstructorDemo obj1=new ConstructorDemo(5,10);
ConstructorDemo obj2=new ConstructorDemo(10,"sa");
}
}