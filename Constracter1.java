package constracter1;

public class Constracter1 {
	int a;
	int b;
	int c;
	
	public int m1()
	{
		//System.out.println("method m1");
		this.m2();
		return(a*b*c);
	}
	public void m2()
	{
		
		System.out.println("method m2");
		//this.m1();
	}
	
	
	Constracter1()
		{
			a=10;
			b=5;
			c=3;
			
		}
		Constracter1(int a,int b,int c)
		{
				this.a=a;
				this.b=b;
				this.c=c;
			
		}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constracter1 c1=new Constracter1();
		
		
		//c1.m1();
		System.out.println(c1.m1());
		/*Constracter1 c2=new Constracter1(2,3,4);
		System.out.println(c2.m1());*/
		c1.m2();
		
	}

}
