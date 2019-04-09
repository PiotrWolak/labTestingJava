import java.util.List;

public class Company {
    private Person CEO;
    private Person CTO;
    private Person CFO;
    private List<Localisation> localisationList;

    public boolean addLocalisation(String localisation){

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        if(company.getCEO()==((Company) o).getCEO() && company.getCEO()==((Company) o).getCEO() &&
                company.getCEO()==((Company) o).getCEO() && company.getCEO()==((Company) o).getCEO()) return true;
        else return false;
    }



    @Override
    public String toString() {
        return "Company{" +
                "CEO=" + CEO +
                ", CTO=" + CTO +
                ", CFO=" + CFO +
                ", localisationList=" + localisationList +
                '}';
    }

    public Person getCEO() {
        return CEO;
    }

    public Person getCTO() {
        return CTO;
    }

    public Person getCFO() {
        return CFO;
    }

    public List<Localisation> getLocalisationList() {
        return localisationList;
    }

    public void setCEO(Person CEO) {
        this.CEO = CEO;
    }

    public void setCTO(Person CTO) {
        this.CTO = CTO;
    }

    public void setCFO(Person CFO) {
        this.CFO = CFO;
    }

    public void setLocalisationList(List<Localisation> localisationList) {
        this.localisationList = localisationList;
    }
}





