import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalisationTest {
    @Test
    public void moveDepartment() {
        Localisation l1 = new Localisation();
        Localisation l2 = new Localisation();
        Department d1 = new Department(DepartmentType.DEVELOPMENT);
        l1.add(d1);
        boolean result=false;
        try {
            result = l1.moveDepartment(l2, d1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(true, result);
    }
    @Test
    public void moveDepartmentFaild() {
        Localisation l1 = new Localisation();
        Localisation l2 = new Localisation();
        Department d1 = new Department(DepartmentType.DEVELOPMENT);
        l1.add(d1);
        l2.add(d1);
        assertThrows(Exception.class, () -> {
            l1.moveDepartment(l2,d1);
        });
    }

}