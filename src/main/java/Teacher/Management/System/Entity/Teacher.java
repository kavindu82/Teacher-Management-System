package Teacher.Management.System.Entity;
import javax.persistence.*;

@Entity
@Table(name="teacher")


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name" )
    private String name;
    @Column(name ="Age")
    private int age;
    @Column(name="Location")
    private String location;

    public Teacher() {
    }

    public Teacher(Long id, String name, int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
