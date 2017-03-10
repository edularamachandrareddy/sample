package testproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		List<Person> listpersons = Arrays.asList(new Person(1, "rammasf", "reddy"),
				new Person(2, "seenudsfsdfsd", "koppala"), new Person(5, "annafdsf", "reddy"),
				new Person(3, "sureshd", "konduri"), new Person(4, "seenu", "golla"));
		Collections.sort(listpersons, (o1, o2) -> o1.getFname().compareTo(o2.getFname()));
		System.out.println(listpersons);
		// Predicate<Person> personcondition=p -> p.getFname().length()<=5;
		PersonPredicate<Person> personpredicate = (Person person) -> person.getFname().length() <= 5;
		testcondition(listpersons, personpredicate);
	}

	private static void testcondition(List<Person> list, PersonPredicate<Person> personpredicate) {
		for (Person person : list) {
			if (personpredicate.test(person))
				System.out.println("person name with the firstname length" + person);
		}

	}
}
