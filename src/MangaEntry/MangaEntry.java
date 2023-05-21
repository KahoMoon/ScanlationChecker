package MangaEntry;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class MangaEntry {

    public enum Status {
        releasing,
        cancelled,
        finished
    }
    public enum Genre {
        action,
        drama,
        fantasy,
        mystery
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

    public MangaEntry() {

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
        System.out.println(altTitles);
        HashSet<String> altTitlesTemp = new HashSet<>();
        for (String i : altTitles) {
            altTitlesTemp.add(i.toLowerCase());
        }
        this.altTitles = altTitlesTemp;
        System.out.println(altTitlesTemp);
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

    public void setStartPublication(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        this.startPublication = cal.getTime();
    }

    public void setStartPublication(Date startPublication) {
        this.startPublication = startPublication;
    }

    public Date getEndPublication() {
        return endPublication;
    }

    public void setEndPublication(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        this.endPublication = cal.getTime();
    }

    public void setEndPublication(Date endPublication) {
        this.endPublication = endPublication;
    }

    public HashSet<Genre> getGenres() {
        return genres;
    }

    public void setGenres(HashSet<Genre> genres) {
        this.genres = genres;
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


        return -99;
    }

    /*
    * Returns a float representing the percentage which the titles match
    * @param entry the entry being compared against
    */
    private float compareTitles(MangaEntry entry) {

        if (Objects.equals(this.title, entry.title)) {
            return 100;
        } else if (this.altTitles.contains(entry.title) || entry.altTitles.contains(this.title)) {
            return 100;
        } else {
            int numOfMatches = 0;
            int numOfComparison = 1;

            if (this.altTitles.size() <= entry.altTitles.size()) {
                for (String i : this.altTitles) {
                    if (entry.altTitles.contains(i)) {
                        numOfMatches++;
                    }
                    numOfComparison++;
                }
            } else {
                for (String i : entry.altTitles) {
                    if (this.altTitles.contains(i)) {
                        numOfMatches++;
                    }
                    numOfComparison++;
                }
            }
            return (float) numOfMatches / numOfComparison;
        }

    }

    private float compareNumOfChapters(MangaEntry entry) {
        return (float) Math.min(this.numOfChapters, entry.numOfChapters) / Math.max(this.numOfChapters, entry.numOfChapters);
    }

    private float compareNumOfVolumes(MangaEntry entry) {
        return (float) Math.min(this.numOfVolumes, entry.numOfVolumes) / Math.max(this.numOfVolumes, entry.numOfVolumes);
    }

    private float compareStatus(MangaEntry entry) {
        if (this.status == entry.status) {
            return 100;
        }
        return 0;
    }

    private float compareDates(MangaEntry entry) {
        long diff = Math.abs(this.startPublication.getTime() - entry.startPublication.getTime());
        long avg = (this.startPublication.getTime() + entry.startPublication.getTime()) / 2;

        return (float) diff / avg;
    }

    public static void main(String[] args) {
        String title = "Shingeki no Kyojin";

        Calendar start = Calendar.getInstance();
        start.set(Calendar.YEAR, 2009);
        start.set(Calendar.MONTH, Calendar.SEPTEMBER);
        start.set(Calendar.DAY_OF_MONTH, 9);
        Date startPublication = start.getTime();

        Calendar end = Calendar.getInstance();
        end.set(Calendar.YEAR, 2021);
        end.set(Calendar.MONTH, Calendar.APRIL);
        end.set(Calendar.DAY_OF_MONTH, 9);
        Date endPublication = end.getTime();

        MangaEntry first = new MangaEntry();
        first.setTitle(title);
        first.setStartPublication(startPublication);
        MangaEntry second = new MangaEntry();
        second.setTitle(title);
        second.setStartPublication(endPublication);
        System.out.println(second.compareGenres(first));
    }

    private float compareGenres(MangaEntry entry) {
        HashSet<Genre> intersection = new HashSet<>(this.genres);
        intersection.retainAll(entry.genres);

        if (intersection.size() == 0) {
            return 0;
        }

        return -999;
    }

}
