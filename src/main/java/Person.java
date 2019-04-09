import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private String pesel;
    private Position position;

    public static Person addPerson() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter name ");
        String name = input.nextLine();
        System.out.println("enter surname");
        String surname = input.nextLine();
        if (name.length() == 0 || surname.length() == 0) throw new NullPointerException("empty name");

        System.out.println("enter pesel ");
        String pesel = input.nextLine();
        PeselValidator p1 = new PeselValidator(pesel);
        if (!p1.isValid()) throw new NullPointerException("wrong pesel");
        System.out.println(p1.getBirthYear());

        // naive and works only in 2019
        if((2019 - p1.getBirthYear())<=18) throw new NullPointerException("you are younger than 18");
        System.out.println("chose position \n " +
                "1-TRAINING_MANAGER, 2-HR_ANALYST, 3-MARKETING_RESEARCH_SPECIALIST, 4-MARKETING_CONSULTANT, 5-JAVA_DEVELOPER, 6-CPP_DEVELOPER");
        int choice = input.nextInt();
        Person newPerson = new Person(name,surname,new Date(), pesel, Position.TRAINING_MANAGER);
        switch (choice) {
            case 1:
                newPerson.position = Position.TRAINING_MANAGER;
                break;
            case 2:
                newPerson.position = Position.HR_ANALYST;
                break;
            case 3:
                newPerson.position = Position.MARKETING_RESEARCH_SPECIALIST;
                break;
            case 4:
                newPerson.position = Position.MARKETING_CONSULTANT;
                break;
            case 5:
                newPerson.position = Position.JAVA_DEVELOPER;
                break;
            case 6:
                newPerson.position = Position.CPP_DEVELOPER;
                break;

            default:
                throw new NullPointerException("bad position");
        }
        newPerson.toString();
        return newPerson;
    }

    //for now public, cause addRandomFolks() in Department class uses this constructor
    public Person(String name, String surname, Date birthDate, String pesel, Position position) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.position = position;
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (person.getPesel() == ((Person) o).getPesel()) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Hey. my " +
                "name is  " + name + "  " + surname  +
                "\tI was born in " + birthDate +
                "\tmy pesel ='" + pesel + '\'' +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPesel() {
        return pesel;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}