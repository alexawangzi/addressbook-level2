package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts the addressbook entries based on alphabetical order of person names
 */

public class SortCommand  extends Command{
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book as a list with index numbers, according to alphabetical order of their names.\n"
            + "Example: " + COMMAND_WORD;



    @Override
    public CommandResult execute() {
        List<Person> allPersons = addressBook.getAllPersons().ListView();
        sortPeople(allPersons);
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }

    private void sortPeople(List<Person> allPersons) {
        Collections.sort(allPersons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                String name1 = p1.getName().toString();
                String name2 = p2.getName().toString();
                return name1.compareTo(name2);
            }
        });
    }

}
