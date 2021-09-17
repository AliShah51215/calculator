package Movie;


public class Movie {
    private String titleOfFilm;
    private int filmDurationInMinutes;
    private int productionYearOfFilm;
    private String nameOfDirector;
    private String surnameOfDirector;



    public Movie(String titleOfFilm,String nameOfDirector, String SurnameOfDirector, int filmDurationInMinutes, int productionYearOfFilm) {
        this.titleOfFilm = titleOfFilm;
        this.filmDurationInMinutes = filmDurationInMinutes;
        this.productionYearOfFilm = productionYearOfFilm;
        this.nameOfDirector = nameOfDirector;
        this.surnameOfDirector = SurnameOfDirector;


    }

    public String getTitleOfMovie() {
        return titleOfFilm;
    }

    public void setTitleOfMovie(String titleOfMovie) {
        this.titleOfFilm = titleOfMovie;
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

        new Movie("Elf", "Robert", "Polanski", 160, 2021);
        new Movie("Avatar", "Mario", "Mariusz", 120, 2000);

    }
}
