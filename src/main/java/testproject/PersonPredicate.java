package testproject;
@FunctionalInterface
public interface PersonPredicate<T> {
	boolean test(T Person);

}
