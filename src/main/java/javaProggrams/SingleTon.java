package javaProggrams;

public class SingleTon {
	private static SingleTon singleton_instance=null;
	private String str;
	private SingleTon()
	{
		str="Hey i am using single ton class";	
		}
	public static SingleTon getInstance()
	{
		if (singleton_instance==null) 
			singleton_instance=new SingleTon();
	 return singleton_instance;
	}

	public static void main(String[] args) {
		
		SingleTon x=SingleTon.getInstance();
		SingleTon y=SingleTon.getInstance();
		SingleTon z=SingleTon.getInstance();
		
		x.str=(x.str).toUpperCase();
	
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
