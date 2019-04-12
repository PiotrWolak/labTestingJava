
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    public void addPerson(){
        Person p1 = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);

            Department d1 = new Department(DepartmentType.DEVELOPMENT);
            boolean result = d1.addDude(p1);
            assertEquals(true, result);
            assertEquals(true, d1.getPersonList().contains(p1));
    }

    @Test
    public void addPersonFailed(){
        Person p1 = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.HR_ANALYST);

        Department d1 = new Department(DepartmentType.DEVELOPMENT);
        boolean success = d1.addDude(p1);
        assertEquals(false, success);

    }

    @Test
    public void relocateTest(){
        Person p1 = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);

        Department d1 = new Department(DepartmentType.DEVELOPMENT);
        d1.addDude(p1);
        Department d2 = new Department(DepartmentType.DEVELOPMENT);
        boolean success = d1.relocateEmployee(p1, d2);
        assertEquals(true, success);

    }
    @Test
    public void relocateTestFail(){
        Person p1 = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);

        Department d1 = new Department(DepartmentType.DEVELOPMENT);
        d1.addDude(p1);
        Department d2 = new Department(DepartmentType.HR);
        boolean success = d1.relocateEmployee(p1, d2);
        assertEquals(false, success);

    }


}