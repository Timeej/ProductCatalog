package rs.ac.singidunum.icr.persistence.model;


import javax.persistence.*;

@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "path_id")
    private String pathId;



    private String name;

    private String description;

    public Category() {
    }

    public Category(String pathId, String name, String description) {
        this.setPathId(pathId);
        this.setName(name);
        this.setDescription(description);
    }

    public Category(int id, String pathId, String name, String description) {
        this.setId(id);
        this.setPathId(pathId);
        this.setName(name);
        this.setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", pathId='" + pathId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
