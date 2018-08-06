class InheratenceDemo{
private String designation="Teacher";
private String collage="Test";

public String getDesignation(){
return designation;
}
protected void setDesignation(String designation){
this.designation=designation;
}
protected String getCollage(){
return collage;
}
protected void setCollage(String collage){
this.collage=collage;
}
void dose(){
System.out.println("Teaching");
}
}
public class InheratenceExample extends InheratenceDemo{
public String mainSubject="Physics";
public static void main(String[] args){
InheratenceExample obj=new InheratenceExample();
System.out.println("Designation:"+obj.getDesignation());
System.out.println("Collaage:"+obj.getCollage());
System.out.println("Subject:"+obj.mainSubject);
obj.dose();

}
}