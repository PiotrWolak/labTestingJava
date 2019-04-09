import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Department {
    private String name;
    private DepartmentType departmentType;
    private List<Person> personList;



    public void addRandomFolks(int n){
        String name ;
        String pesel = "12345678910";
        PeselValidator p1 = new PeselValidator(pesel);
        for(int i=0; i<n; i++){
            Random random = new Random();
            name = "Piotrek" + random.nextInt(100);
            this.personList.add(new Person(name, "wolak", new Date(), pesel, Position.JAVA_DEVELOPER));
        }
    }

    public Department() {
        this.name = "departament sprawiedliwosci";
        this.departmentType = DepartmentType.DEVELOPMENT;
        this.personList = new ArrayList<Person>();
    }

    public Department(String name, DepartmentType departmentType) {
        this.name = name;
        this.departmentType = departmentType;
        this.personList = new ArrayList<Person>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        //todo
        return false;
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentType=" + departmentType +
                ", personList=" + personList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}