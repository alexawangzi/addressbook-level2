package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    public
    String value;
    protected boolean isPrivate;

    public Contact(){

    }
    public Contact(String contactDetail, boolean isPrivate) throws IllegalValueException {
        this.value = contactDetail;
        this.isPrivate=isPrivate;
    }
}
