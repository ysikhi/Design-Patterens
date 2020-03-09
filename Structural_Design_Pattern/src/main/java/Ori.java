
public class Ori implements file
{
	private String doc;
	Ori(String doc)
	{
		this.doc=doc;
	}
	public void s()
	{
		System.out.println("Sharing of file "+doc);
		loading(doc);
	}
	public void loading(String r)
	{
		System.out.println("loading the file to be shared "+r);
		
	}
	

}
