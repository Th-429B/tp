package seedu.fast.logic.commands;

import seedu.fast.commons.core.Messages;
import seedu.fast.commons.core.index.Index;
import seedu.fast.model.Fast;
import seedu.fast.model.Model;
import seedu.fast.model.ModelManager;
import seedu.fast.model.UserPrefs;
import seedu.fast.model.person.Appointment;
import seedu.fast.model.person.Person;
import seedu.fast.testutil.PersonBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.fast.logic.commands.CommandTestUtil.VALID_APPOINTMENT_AMY;
import static seedu.fast.logic.commands.CommandTestUtil.VALID_APPOINTMENT_BOB;
import static seedu.fast.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.fast.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.fast.logic.commands.CommandTestUtil.showPersonAtIndex;
import static seedu.fast.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.fast.testutil.TypicalIndexes.INDEX_SECOND_PERSON;
import static seedu.fast.testutil.TypicalPersons.getTypicalFast;

public class AppointmentCommandTest {
    private static final String APPOINTMENT_STUB = "10 Oct 2021";
    private Model model = new ModelManager(getTypicalFast(), new UserPrefs());

    @Test
    public void equals() {
        final AppointmentCommand standardCommand = new AppointmentCommand(INDEX_FIRST_PERSON,
                new Appointment(VALID_APPOINTMENT_AMY));

        // same values -> returns true
        AppointmentCommand commandWithSameValues = new AppointmentCommand(INDEX_FIRST_PERSON,
                new Appointment(VALID_APPOINTMENT_AMY));
        assertTrue(standardCommand.equals(commandWithSameValues));

        // same object -> returns true
        assertTrue(standardCommand.equals(standardCommand));

        // null -> returns false
        assertFalse(standardCommand.equals(null));

        // different types -> returns false
        assertFalse(standardCommand.equals(new ClearCommand()));

        // different index -> returns false
        assertFalse(standardCommand.equals(new AppointmentCommand(INDEX_SECOND_PERSON,
                new Appointment(VALID_APPOINTMENT_AMY))));

        // different appointment -> returns false
        assertFalse(standardCommand.equals(new AppointmentCommand(INDEX_FIRST_PERSON,
                new Appointment(VALID_APPOINTMENT_BOB))));
    }

    @Test
    public void execute_invalidPersonIndexUnfilteredList_failure() {
        Index outOfBoundIndex = Index.fromOneBased(model.getFilteredPersonList().size() + 1);
        AppointmentCommand apptCommand = new AppointmentCommand(outOfBoundIndex, new Appointment(VALID_APPOINTMENT_BOB));

        assertCommandFailure(apptCommand, model, Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
    }

    @Test
    public void execute_invalidPersonIndexFilteredList_failure() {
        showPersonAtIndex(model, INDEX_FIRST_PERSON);
        Index outOfBoundIndex = INDEX_SECOND_PERSON;
        // ensures that outOfBoundIndex is still in bounds of FAST list
        assertTrue(outOfBoundIndex.getZeroBased() < model.getFast().getPersonList().size());

        AppointmentCommand apptCommand = new AppointmentCommand(outOfBoundIndex, new Appointment(VALID_APPOINTMENT_BOB));
        assertCommandFailure(apptCommand, model, Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
    }
}
