package head.fiest.java;

public class MovieTestDrive {

    public static void main(String[] args) {
	// Создаем объекты - фильмы
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
    }
}
