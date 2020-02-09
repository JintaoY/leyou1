import java.util.Objects;

public class Person1 {

    private Integer id;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(id, person1.id) &&
                Objects.equals(userName, person1.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName);
    }
}
