
public class e implements State {
	public void a( A a) {
	      System.out.println("End state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return " in the End State";
	   }
}
