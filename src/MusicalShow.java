import java.util.List;

public class MusicalShow extends Show {

    protected Person musicAuthor;
    protected String librettoText;

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
