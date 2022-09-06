package rs.ac.singidunum.icr.persistence.model;

import javax.persistence.*;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    @Column(name = "workdays_workhours")
    private String workdaysWorkhours;

    @Column(name = "weekend_workhours")
    private String weekendWorkhours;

    public Shop() {

    }

    public Shop(String name, String address, String workdaysWorkhours, String weekendWorkhours) {
        this.setName(name);
        this.setAddress(address);
        this.setWorkdaysWorkhours(workdaysWorkhours);
        this.setWeekendWorkhours(weekendWorkhours);
    }

    public Shop(int id, String name, String address, String workdaysWorkhours, String weekendWorkhours) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setWorkdaysWorkhours(workdaysWorkhours);
        this.setWeekendWorkhours(weekendWorkhours);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkdaysWorkhours() {
        return workdaysWorkhours;
    }

    public void setWorkdaysWorkhours(String workdaysWorkhours) {
        this.workdaysWorkhours = workdaysWorkhours;
    }

    public String getWeekendWorkhours() {
        return weekendWorkhours;
    }

    public void setWeekendWorkhours(String weekendWorkhours) {
        this.weekendWorkhours = weekendWorkhours;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workdaysWorkhours='" + workdaysWorkhours + '\'' +
                ", weekendWorkhours='" + weekendWorkhours + '\'' +
                '}';
    }
}
