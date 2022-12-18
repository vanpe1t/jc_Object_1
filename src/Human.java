import java.util.Objects;

public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human() {
        this.yearOfBirth = 0;
        this.name = "John Doe";
        this.town = "Ghost city";
    }

    public Human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && name.equals(human.name) && town.equals(human.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth
                + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
