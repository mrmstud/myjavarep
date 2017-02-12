/**
 * 
 */
package mrm.learn.patterns;

/**
 * @author mahallem
 *
 */
public class SingletonPatterTestOne {
	
	private static final Boolean LIVING = true; // IF this statement is after 17 then LIVING will be NULL and line 30 will do auto-unboxing which causes NULLPOINTER
	private final Boolean alive = LIVING; // Hence variables-static blocks-contructors follow this seq. Also don't use Wrapper objects in ternary operator
	
	private SingletonPatterTestOne(){	} // private constructor
	
	public static final SingletonPatterTestOne SINGLETON_PATTER_TEST_ONE = new SingletonPatterTestOne();
	
	
	
	public final Boolean lives() {
		return alive; // ERROR Cannot make a static reference to the non-static field alive	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result is : "+ (SINGLETON_PATTER_TEST_ONE.lives()?"Yes Alive":"Dead"));
	}

}
