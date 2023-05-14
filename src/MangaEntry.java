import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class MangaEntry {

    enum Status {
        releasing,
        cancelled,
        finished
    }
    enum Genre {
        action,
        drama,
        fantasy,
        mystery
    }

    String title;
    HashSet<String> altTitles;
    int numOfChapters;
    int numOfVolumes;
    Status status;
    Date startPublication;
    Date endPublication;
    HashSet<Genre> genre;

    public MangaEntry(String title, HashSet<String> altTitles, int numOfChapters, int numOfVolumes, Status status, Date startPublication, Date endPublication, HashSet<Genre> genres) {
        this.title = title;
        this.altTitles = altTitles;
        this.numOfChapters = numOfChapters;
        this.numOfVolumes = numOfVolumes;
        this.status = status;
        this.startPublication = startPublication;
        this.endPublication = endPublication;
        this.genre = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashSet<String> getAltTitles() {
        return altTitles;
    }

    public void setAltTitles(HashSet<String> altTitles) {
        this.altTitles = altTitles;
    }

    public int getNumOfChapters() {
        return numOfChapters;
    }

    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    public int getNumOfVolumes() {
        return numOfVolumes;
    }

    public void setNumOfVolumes(int numOfVolumes) {
        this.numOfVolumes = numOfVolumes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getStartPublication() {
        return startPublication;
    }

    public void setStartPublication(Date startPublication) {
        this.startPublication = startPublication;
    }

    public Date getEndPublication() {
        return endPublication;
    }

    public void setEndPublication(Date endPublication) {
        this.endPublication = endPublication;
    }

    public HashSet<Genre> getGenre() {
        return genre;
    }

    public void setGenre(HashSet<Genre> genre) {
        this.genre = genre;
    }

    private int equalsHelper(Object obj) {

        //https://stackoverflow.com/questions/8180430/how-to-override-equals-method-in-java

        if (obj == null) {
            return 0;
        }
        if (obj.getClass() != this.getClass()) {
            return 0;
        }

        final MangaEntry other = (MangaEntry) obj;
        boolean titleMatch = this.title.equals(other.title);
        boolean
        if () {

        }

        return -99;
    }

    /*
    * Returns a float representing the percentage which the titles match
    * @param entry the entry being compared against
    */
    private float compareTitle(MangaEntry entry) {

        if (Objects.equals(this.title, entry.title)) {
            return 100;
        } else if (this.altTitles.contains(entry.title) || entry.altTitles.contains(this.title)) {
            return 100;
        }

        return 0;

    }

}
