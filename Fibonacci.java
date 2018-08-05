class Fibonacci{

public static void main(String[] args) {

 int i;
 int f1=0;
 int f2=1;

for(i=0;i<10;++i){

int f3=f1+f2;
	f1=f2;
	f2=f3;

System.out.print(f3+" ");
}

}
}