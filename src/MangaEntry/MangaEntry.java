package MangaEntry;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class MangaEntry {

    public static void main(String[] args) {

    }

    public enum Status {
        releasing,
        cancelled,
        finished
    }
    public enum Genre {
        action,
        adventure,
        comedy,
        ecchi,
        horror,
        mecha,
        music,
        psychological,
        romance,
        scifi,
        slice_of_life,
        sports,
        supernatural,
        thriller,
        drama,
        fantasy,
        mystery,

    }

    private String title;
    private HashSet<String> altTitles;
    private int numOfChapters;
    private int numOfVolumes;
    private Status status;
    private Date startPublication;
    private Date endPublication;
    private HashSet<Genre> genres;

    public MangaEntry(String title, HashSet<String> altTitles, int numOfChapters, int numOfVolumes, Status status, int startMonth, int startDay, int startYear, int endMonth, int endDay, int endYear, HashSet<Genre> genres) {
        this.setTitle(title);
        this.setAltTitles(altTitles);
        this.setNumOfChapters(numOfChapters);
        this.setNumOfVolumes(numOfVolumes);
        this.setStatus(status);
        this.setStartPublication(startMonth, startDay, startYear);
        this.setEndPublication(endMonth, endDay, endYear);
        this.setGenres(genres);
    }

    public MangaEntry(String title, HashSet<String> altTitles, int numOfChapters, int numOfVolumes, Status status, Date startPublication, Date endPublication, HashSet<Genre> genres) {
        this.setTitle(title);
        this.setAltTitles(altTitles);
        this.setNumOfChapters(numOfChapters);
        this.setNumOfVolumes(numOfVolumes);
        this.setStatus(status);
        this.setStartPublication(startPublication);
        this.setEndPublication(endPublication);
        this.setGenres(genres);
    }

    /*Returns the title*/
    public String getTitle() {
        return title;
    }

    /*Sets the title
    * @param titles the title being set to the entry*/
    public void setTitle(String title) {
        this.title = title;
    }

    /*Returns a HashSet of all the alternative titles*/
    public HashSet<String> getAltTitles() {
        return altTitles;
    }

    /*Sets the alternative titles
    * @param altTitles the alternative titles being set to the entry*/
    public void setAltTitles(HashSet<String> altTitles) {
        HashSet<String> altTitlesTemp = new HashSet<>();
        for (String i : altTitles) {
            altTitlesTemp.add(i.toLowerCase());
        }
        this.altTitles = altTitlesTemp;
    }

    /*Returns the number of chapters*/
    public int getNumOfChapters() {
        return numOfChapters;
    }

    /*Sets tbe number of chapters
    * @param numOfChapters the number of chapters being set to the entry*/
    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    /*Returns the number of volumes*/
    public int getNumOfVolumes() {
        return numOfVolumes;
    }

    /*Sets the number of volumes
    * @param numOfVolumes the number of volumes being set to the entry*/
    public void setNumOfVolumes(int numOfVolumes) {
        this.numOfVolumes = numOfVolumes;
    }

    /*Returns the status*/
    public Status getStatus() {
        return status;
    }

    /*Sets the status
    * @param status the status being set to the entry*/
    public void setStatus(Status status) {
        this.status = status;
    }

    /*Returns the date which publication started*/
    public Date getStartPublication() {
        return startPublication;
    }

    /*Sets the date which the entry started publication
    * @param month the month which publication started
    * @param day the day which publication started
    * @param year the year which publication started*/
    public void setStartPublication(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        this.startPublication = cal.getTime();
    }

    /*Sets the date which the entry started publication
    * @param startPublication the start date being set to the entry*/
    public void setStartPublication(Date startPublication) {
        this.startPublication = startPublication;
    }

    /*Returns the date which publication ended*/
    public Date getEndPublication() {
        return endPublication;
    }

    /*Sets the date which the entry stop publication
    * @param month the month which publication ended
    * @param day the day which publication ended
    * @param year the year which publication ended*/
    public void setEndPublication(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        this.endPublication = cal.getTime();
    }

    /*Sets the date which the entry ended publication
    * @param endPublication the end date being set to the entry*/
    public void setEndPublication(Date endPublication) {
        this.endPublication = endPublication;
    }

    /*Return a HashSet containing the genres*/
    public HashSet<Genre> getGenres() {
        return genres;
    }

    /*Sets the genres
    * @param genres the list of genres being set to the entry*/
    public void setGenres(HashSet<Genre> genres) {
        this.genres = genres;
    }

    /*Returns a float value representing the percent similarity between the entries
    * @param obj the obj being compared against*/
    public double equalsHelper(Object obj) {

        //https://stackoverflow.com/questions/8180430/how-to-override-equals-method-in-java

        if (obj == null) {
            return 0;
        }
        if (obj.getClass() != this.getClass()) {
            return 0;
        }

        double titleWeight = 0.20;
        double chapterWeight = 0.20;
        double volumeWeight = 0.25;
        double statusWeight = 0.10;
        double dateWeight = 0.15;
        double genreWeight = 0.10;

        final MangaEntry other = (MangaEntry) obj;
        float titleSimilarity = this.compareTitles(other);
        float chapterSimilarity = this.compareNumOfChapters(other);
        float volumeSimilarity = this.compareNumOfVolumes(other);
        float statusSimilarity = this.compareStatus(other);
        float dateSimilarity = this.compareDates(other);
        float genreSimilarity = this.compareGenres(other);



        return (titleWeight * titleSimilarity) + (chapterWeight * chapterSimilarity) + (volumeWeight * volumeSimilarity) + (statusWeight * statusSimilarity) + (dateWeight * dateSimilarity) + (genreWeight * genreSimilarity);
    }

    /*
    * Returns a float value representing the percentage similarity between the titles
    * @param entry the entry being compared against
    */
    private float compareTitles(MangaEntry entry) {

        if (Objects.equals(this.title, entry.title)) {
            return 100;
        } else if (this.altTitles.contains(entry.title) || entry.altTitles.contains(this.title)) {
            return 100;
        } else {

            HashSet<String> intersection = new HashSet<>(this.altTitles);
            intersection.retainAll(entry.altTitles);
            HashSet<String> union = new HashSet<>(this.altTitles);
            union.addAll(entry.altTitles);

            return 100 * (float) intersection.size() / union.size();
        }

    }

    /*Returns a float value representing the percent similarity between the number of chapters
    * @param entry the entry being compared against*/
    private float compareNumOfChapters(MangaEntry entry) {
        return (float) (Math.min(this.numOfChapters, entry.numOfChapters) / Math.max(this.numOfChapters, entry.numOfChapters) * 100);
    }

    /*Returns a float value representing the percent similarity between the number of volumes
    * @param entry the entry being compared against*/
    private float compareNumOfVolumes(MangaEntry entry) {
        return (float) (Math.min(this.numOfVolumes, entry.numOfVolumes) / Math.max(this.numOfVolumes, entry.numOfVolumes) * 100);
    }

    /*Returns a float value representing the percent similarity between the statuses
    * @param entry the entry being compared against*/
    private float compareStatus(MangaEntry entry) {
        if (this.status == entry.status) {
            return 100;
        }
        return 0;
    }

    /*Returns a float value representing the percent similarity between the start/end dates
    * @param the entry being compared against*/
    private float compareDates(MangaEntry entry) {
        long diff = Math.abs(this.startPublication.getTime() - entry.startPublication.getTime());
        long avg = (this.startPublication.getTime() + entry.startPublication.getTime()) / 2;

        return (100 - ((float) diff / avg * 100));
    }

    /*Returns a float value representing the percent similarity between the genres using Jaccard similarity
    * @param entry the entry being compared against*/
    private float compareGenres(MangaEntry entry) {

        //#(A intersect B)/#(A union B)
        HashSet<Genre> intersection = new HashSet<>(this.genres);
        intersection.retainAll(entry.genres);
        HashSet<Genre> union = new HashSet<>(this.genres);
        union.addAll(entry.genres);

        return 100 * (float) intersection.size() / union.size();
    }

}
