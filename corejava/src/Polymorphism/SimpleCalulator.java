package Polymorphism;

public class SimpleCalulator {
	void prnsqr(int i)
	{  
		System.out.println("square of int "+i+" is:"+i*i);
	}
	void prnsqr(char c)
	{
		System.out.println("square of char "+c+" is "+c*c);
	}
	void prnsqr(float f)
	{
		System.out.println("square of float "+f+" is "+f*f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalulator obj=new SimpleCalulator();
		obj.prnsqr(5);
	    obj.prnsqr('a');
	    
	}

}
