package seedu.fast.logic;

import java.nio.file.Path;

import javafx.collections.ObservableList;
import seedu.fast.commons.core.GuiSettings;
import seedu.fast.logic.commands.CommandResult;
import seedu.fast.logic.commands.exceptions.CommandException;
import seedu.fast.logic.parser.exceptions.ParseException;
import seedu.fast.model.ReadOnlyFast;
import seedu.fast.model.person.Person;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the AddressBook.
     *
     * @see seedu.fast.model.Model#getFast()
     */
    ReadOnlyFast getFast();

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getFastFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);
}
