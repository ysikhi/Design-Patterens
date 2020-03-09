
public class s implements State {
public void a(A a)
{
	System.out.println("Initial state is instantiated");
	a.setState(this);
}
public String toString(){
    return (" in the Initial State");
 }
}
