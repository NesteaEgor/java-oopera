import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Настя", "Ивлеева", Gender.FEMALE, 170);
        Actor actor2 = new Actor("Илон", "Маск", Gender.MALE, 182);
        Actor actor3 = new Actor("Егор", "Нестеров", Gender.MALE, 178);

        Director director1 = new Director("Пол", "Андерсон", Gender.MALE, 10);
        Director director2 = new Director("Мила", "Йовович", Gender.FEMALE, 8);

        //сделал просто персонами
        Person musicAuthor = new Person("Иван", "Иванов", Gender.MALE);
        Person choreographer = new Person("Петр", "Петров", Gender.MALE);

        Show show = new Show("Обычный спектакль", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Опера", 100,
                director2, new ArrayList<>(), musicAuthor,
                "Либретто для оперы", 3 );
        Ballet ballet = new Ballet("Балет", 50,
                director2, new ArrayList<>(), musicAuthor,
                "Либретто для балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor1);
        opera.addActor(actor3);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("\nСостав обычного спектакля");
        show.printActors();
        System.out.println("\nСостав оперы");
        opera.printActors();
        System.out.println("\nСостав балета");
        ballet.printActors();

        System.out.println("\nЗамена в опере: Ивлеева - Маск");
        opera.replaceActor("Ивлеева", actor2);

        System.out.println("\nОпера: состав после замены");
        opera.printActors();

        System.out.println("\nПопытка замены несуществующего актёра в обычном спектакле: ");
        show.replaceActor("Несуществующий", actor3);

        System.out.println("\nЛибретто оперы: ");
        opera.printLibrettoText();

        System.out.println("\nЛибретто балета:");
        ballet.printLibrettoText();

        System.out.println("\nРежиссёры спектаклей:");
        System.out.print("Обычный спектакль — ");
        show.printDirectorInfo();

        System.out.print("Опера — ");
        opera.printDirectorInfo();

        System.out.print("Балет — ");
        ballet.printDirectorInfo();
    }
}
