package recursivePackage;

public class RecursiveMain {
	
	public static String recursiveString(String in)
	{
		char x,y;
		for(int i=0; i<in.length();i++)
		{
			if(i<in.length()-1)
			{
			x=in.charAt(i);
			y=in.charAt(i+1);
			if(x==y)
			{
				in=in.substring(0, i+1) + "-" + in.substring(i+1, in.length());
				recursiveString(in);
			}
			}
		}
		return in;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(recursiveString("HelloTestingggg"));

	}

}
