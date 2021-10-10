package seedu.fast.commons.util;

import java.util.Comparator;

import seedu.fast.model.person.Person;

public class SortByName implements Comparator<Person> {

    public static final String KEYWORD = "name";

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().fullName.compareTo(p2.getName().fullName);
    }
}
