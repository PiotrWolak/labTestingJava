import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company c1;
    Department d1;
    @BeforeEach
    void setUp() {
         c1 = new Company();
         d1 = new Department(DepartmentType.HR);

    }

    @Test
    public void isNumberOfPeopleFixed(){
        Person person = Person.addPerson("Abc", "Defs", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);
        d1.addDude(person);
        Department d2 = new Department(DepartmentType.HR);
        d2.addRandomFolks(10);
        d1.addRandomFolks(4);
        Localisation l1 = new Localisation();
        l1.add(d1);
        Localisation l2 = new Localisation();
        l2.add(d2);
        c1.addLocalisation(l1);
        c1.addLocalisation(l2);
        int sum = 0;
        sum = c1.sumUpWorkers();
        assertEquals(15, sum, "message");

        try {
            l1.moveDepartment(l2,d1);
            d1.relocateEmployee(person, d2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sum=c1.sumUpWorkers();
        assertEquals(15, sum, "assert po przenoszeniu");
    }

}