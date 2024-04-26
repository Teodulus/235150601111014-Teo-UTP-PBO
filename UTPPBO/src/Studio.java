public class Studio {

    private Movie movie;
    private String type;
    private boolean [] seats;
    public Studio (String type);
    public String getStudioInfo;
    public int isBooked (char row, int col);
    public String getType;
    public Movie getMovie;

    public void setGetMovie(Movie getMovie) {
        this.getMovie = getMovie;
    }

    private void setSeats(boolean[] seats) {
        this.seats = seats;
    }
}
