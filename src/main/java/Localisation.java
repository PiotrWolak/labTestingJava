import java.util.ArrayList;
import java.util.List;

public class Localisation {
    private String name;
    private String city;
    private List<Department> departmentList = new ArrayList<Department>();

    public boolean moveDepartment(Localisation l, Department d) throws Exception {
        if(l.departmentList.contains(d)) throw new Exception("Location already occupied by this department");
        if(this.departmentList.contains(d)){
            if(!this.departmentList.contains(d))throw new Exception("chuj");
            l.departmentList.add(d);
            this.departmentList.remove(d);
            return true;
        }
        return false;
    }
    public void add(Department department){
        departmentList.add(department);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localisation that = (Localisation) o;
        //todo
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }


}