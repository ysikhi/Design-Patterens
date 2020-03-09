
public class Costfactory {
public Specialization getPhone(String s)
{
	if (s.equals("Iphone6s"))
{
	return new Iphone6s();
}
	else if(s.equals("Iphone7s"))
			{
		return new Iphone7s();
				
			}
	else if(s.equals("Iphone11"))
	{
		return new Iphone11();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}
