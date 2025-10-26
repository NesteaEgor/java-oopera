import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;

        Actor actor = (Actor) o;
        return height == actor.height && //рост
                Objects.equals(getName(), actor.getName()) && //имя через гет из суперкласса
                Objects.equals(getSurname(), actor.getSurname()); //фамилия через гет из суперкласс
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height); //имя, фамилич, рост
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + '\'' +  //имя
                ", surname='" + getSurname() + '\'' +  // фамилия
                " (height=" + height + ")" +  //рост в скобках по ТЗ
                '}';
    }
}
