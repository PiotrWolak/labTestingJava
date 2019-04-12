import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void correctArguments() {
        try {
            Person person = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void incorrectName() {
        assertThrows(Exception.class, () -> {
            Person person = Person.addPerson("", "sd", new Date(1998, 11, 22), "98112205459", Position.JAVA_DEVELOPER);
        });
    }

    @Test
    public void incorrectSurname() {
        assertThrows(Exception.class, () -> {
            Person person = Person.addPerson("sd", "", new Date(), "98112205459", Position.JAVA_DEVELOPER);
        });
    }

    @Test
    public void personUnderage() {
        assertThrows(Exception.class, () -> {
            Person person = Person.addPerson("Asaf", "Tewd", new Date(2008, 11, 22), "07211264445", Position.JAVA_DEVELOPER);
        });
    }

    @Test
    public void incorrectPesel() {
        assertThrows(Exception.class, () -> {
            Person person = Person.addPerson("", "sd", new Date(1998, 11, 22), "981159", Position.JAVA_DEVELOPER);
        });
    }
}



