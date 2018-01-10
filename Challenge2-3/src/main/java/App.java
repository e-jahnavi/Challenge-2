/**
 *
 */
package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	/**
	 * @param args
	 */
	public static List<UserDetails> ls = new ArrayList<UserDetails>();
	public static void main(String[] args) {
		saveData();
		loadData();
	}

	private static void saveData() {
		final UserDetails user1 = new UserDetails(1, "Mike", "8769329876", "NY");
		final UserDetails user2 = new UserDetails(2, "John", "8769359876", "MA");
		final UserDetails user3 = new UserDetails(3, "Brian", "8769989876", "PA");
		final UserDetails user4 = new UserDetails(4, "Paul", "8769933876", "AL");
		final UserDetails user5 = new UserDetails(5, "Henry", "8769219876", "DE");
		final UserDetails user6 = new UserDetails(6, "Sam", "8769985776", "NC");
		ls.add(user1);
		ls.add(user2);
		ls.add(user3);
		ls.add(user4);
		ls.add(user5);
		ls.add(user6);
	}

	private static void loadData() {
		final Iterator<UserDetails> ud = ls.iterator();
		while (ud.hasNext()) {
			System.out.println(ud.next());
		}
	}

}
