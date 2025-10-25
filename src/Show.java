import java.util.ArrayList;
import java.util.List;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director,
                List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);  //Печать актёров по ТЗ
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Передано null.");
            return;
        }

        if (listOfActors.contains(actor)) {
            System.out.println("Уже участвует в спектакле: " + actor);
            return;
        }

        listOfActors.add(actor);
        System.out.println("Добавлен в спектакль: " + actor);
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        if (surnameToReplace == null || newActor == null) {
            System.out.println("Некорректные данные для замены актёра.");
            return;
        }

        // if (listOfActors == null || listOfActors.isEmpty()) {
        //    System.out.println("Список актёров пуст. Замена невозможна.");
        //    return;
        //}

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (surnameToReplace.equals(currentActor.getSurname())) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + currentActor + "\nзаменён на " + newActor);
                return;
            }
        }

        System.out.println("Актёр со следующей фамилией  не найден: " + surnameToReplace);
    }

}
