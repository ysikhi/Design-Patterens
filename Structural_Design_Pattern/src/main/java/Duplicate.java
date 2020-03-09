
public class Duplicate implements file {
	private String doc;
	 private Ori o;
	  
	Duplicate(String doc)
	{
		this.doc=doc;
		
	}
	public void s()
	{
		
		
		if(o==null)
		{
			o =new Ori(doc);
		}
		o.s();
	}

}
