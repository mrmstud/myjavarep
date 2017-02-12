package mrm.learn;

import java.util.HashSet;
import java.util.Set;

public class SetRemoveTest {

	public static void main(String[] args) {
		Set<Short> shortSet = new HashSet<Short>();
		for(short i=0;i<100;i++){
			shortSet.add(i); // if in for loop if i is of type int then you cannot add i to set without casting it it to short
			shortSet.remove(i-1); // i is short and 1 is int, so this is coneverted to Integer and since there are no Integers in this set, so remove method returns false
			// hence output of this prog is 100
		}
		System.out.println("Set Size : " + 	shortSet.size());
	}

}
