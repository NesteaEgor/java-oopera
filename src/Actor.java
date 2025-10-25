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
                Objects.equals(name, actor.name) && //имя через гет из суперкласса
                Objects.equals(surname, actor.surname); //фамилия через гет из суперкласс
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height); //имя, фамилич, рост
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +  //имя
                ", surname='" + surname + '\'' +  // фамилия
                " (height=" + height + ")" +  //рост в скобках по ТЗ
                '}';
    }
}
