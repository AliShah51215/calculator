package Film;

public class Film {
    private String titleOfMovie;
    private int filmDurationInMinutes;
    private int productionYearOfFilm;
    private String nameOfDirector;
    private String surnameOfDirector;



    public Film(String titleOfMovie,String nameOfDirector, String SurnameOfDirector, int filmDurationInMinutes, int productionYearOfFilm) {
        this.titleOfMovie = titleOfMovie;
        this.filmDurationInMinutes = filmDurationInMinutes;
        this.productionYearOfFilm = productionYearOfFilm;
        this.nameOfDirector = nameOfDirector;
        this.surnameOfDirector = SurnameOfDirector;


    }

    public String getTitleOfMovie() {
        return titleOfMovie;
    }

    public void setTitleOfMovie(String titleOfMovie) {
        this.titleOfMovie = titleOfMovie;
    }


    public int getFilmDurationInMinutes() {
        return filmDurationInMinutes;
    }

    public void setFilmDurationInMinutes(int filmDurationInMinutes) {
        this.filmDurationInMinutes = filmDurationInMinutes;
    }

    public int getProductionYearOfFilm() {
        return productionYearOfFilm;
    }

    public void setProductionYearOfFilm(int productionYearOfFilm) {
        this.productionYearOfFilm = productionYearOfFilm;
    }
    public String getNameOfDirector() {
        return nameOfDirector;
    }
    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public String getSurnameOfDirector() {
        return surnameOfDirector;
    }

    public void setSurnameOfDirector(String SurnameOfDirector) {
        this.surnameOfDirector = SurnameOfDirector;
    }



    public static void main(String[] args) {

        new Film("Rambo", "Robert", "Polanski", 160, 2021);
        new Film("Avatar1", "Mario", "Mariusz", 120, 2000);

    }
}