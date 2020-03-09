
public class m implements State {
	public void a( A a) {
	      System.out.println("Intermediate state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return "in the Intermediate state";
	   }
}
