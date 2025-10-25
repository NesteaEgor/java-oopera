import java.util.List;

public class MusicalShow extends Show {

    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration,
                       Director director,
                       List<Actor> listOfActors,
                       Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public void printLibrettoText() {
        System.out.println(librettoText); //печать либретто по ТЗ
    }
}
