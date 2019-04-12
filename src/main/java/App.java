import java.util.Date;

public class App {
    public static void main(String[] args) {

        Company c1 = new Company();
        Person.addPerson("dwadwa", "dwada", new Date(1998, 11, 22), "97082509673", Position.JAVA_DEVELOPER);
        Department d1 = new Department();
        d1.addRandomFolks(5);
    }
}
