/**
 * 
 */
package mrm.learn;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mahallem
 * Use URI instead of URL class. Because, equals and hashCode methods of URL class do no produce unique results as the environment chnages.
 * URI is new class which correctly handles equals and hashcodes.
 */
public class SetPrintTestForURL {

	private static final String[] URL_NAMES = {
		"http://javapuzzlers.com",
		"http://www.google.com",
		"http://www.gmail.com",
		"http://javapuzzlers.com", // duplicate element
		"http://www.w3schools.com"
	};
	
	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		Set<URI> uriSet = new HashSet<URI>();
		for (String uri : URL_NAMES) {
			uriSet.add(URI.create(uri));
		}
		System.out.println("URI Set Size : " + uriSet.size());		
		System.out.println("URL from URI : " + URI.create("http://javapuzzlers.com").toURL()); // create URL from URI
	}

}
