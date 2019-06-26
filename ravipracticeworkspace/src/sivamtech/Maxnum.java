package sivamtech;

public class Maxnum 
{
int x,y;
Maxnum(){
	x=20;y=30;
}
void max(int a, int b) {
	if(x>y) {
		System.out.println("x is max");
	}
	else {
		System.out.println("y is max");
	}
}
}
class maxnum2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Maxnum  m=new Maxnum();
     m.max(200, 300);
     
	}
}


