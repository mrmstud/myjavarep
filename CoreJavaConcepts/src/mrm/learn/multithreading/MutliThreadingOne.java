/**
 * 
 */
package mrm.learn.multithreading;

/**
 * @author mahallem
 * 
 */
public class MutliThreadingOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = 2;
		System.out.println("Result is : " + checkNumber(number));
		
	}

	private final static boolean checkNumber(int number) {		
		return (2==number)?true:false;
	}
	
}
