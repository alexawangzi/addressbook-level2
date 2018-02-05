package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";



    /** Format of a comment input line. Comment lines are silently consumed when reading user input. */
    private static final String COMMENT_LINE_FORMAT_REGEX = "#.*";

    public boolean matches(String stringToTestForMatching){
        return stringToTestForMatching.matches(COMMENT_LINE_FORMAT_REGEX);
    }

    public String addLinePrefix(String stringToAdd){
        return LINE_PREFIX+stringToAdd;
    }

    public String formatCommandEntered(String stringToBeFormatted){
        return "[Command entered:" + stringToBeFormatted + "]";
    }

    public String formatMessageShownToUser(String m){
       return LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);
    }

    public String formatIndexedListItem(int visibleIndex, String listItem ) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }


}
