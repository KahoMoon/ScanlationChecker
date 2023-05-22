package MangaEntry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MangaEntryTest {

    static MangaEntry first;
    static MangaEntry second;
    @BeforeEach
    void testSetup() {
        String title = "Shingeki no Kyojin";

        HashSet<String> altTitles = new HashSet<>();
        altTitles.add("Atak Tytanów");
        altTitles.add("SnK");
        altTitles.add("AoT");
        altTitles.add("L'Attacco dei Giganti");
        altTitles.add("Útok titánů");
        altTitles.add("進撃の巨人");

        int numOfChapters = 141;
        int numOfVolumes = 34;

        MangaEntry.Status status = MangaEntry.Status.finished;

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

        HashSet<MangaEntry.Genre> genres = new HashSet<>();
        genres.add(MangaEntry.Genre.action);
        genres.add(MangaEntry.Genre.drama);
        genres.add(MangaEntry.Genre.fantasy);
        genres.add(MangaEntry.Genre.mystery);

        first = new MangaEntry(title, altTitles, numOfChapters, numOfVolumes, status, startPublication, endPublication, genres);
        second = new MangaEntry(title, altTitles, numOfChapters, numOfVolumes, status, startPublication, endPublication, genres);
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        assertEquals(first.getTitle(), second.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        String newTitle = "Attack on Titan";
        first.setTitle(newTitle);
        assertEquals(first.getTitle(), newTitle);
    }

    @org.junit.jupiter.api.Test
    void getAltTitles() {
        assertEquals(first.getAltTitles(), second.getAltTitles());
    }

    @org.junit.jupiter.api.Test
    void setAltTitles() {
        HashSet<String> newAlt = new HashSet<>();
        newAlt.add("test1");
        newAlt.add("test2");
        first.setAltTitles(newAlt);
        assertEquals(newAlt, first.getAltTitles());
    }

    @org.junit.jupiter.api.Test
    void getNumOfChapters() {
        assertEquals(first.getNumOfChapters(), second.getNumOfChapters());
    }

    @org.junit.jupiter.api.Test
    void setNumOfChapters() {
        int newNumOfChapters = 123;
        first.setNumOfChapters(newNumOfChapters);
        assertEquals(newNumOfChapters, first.getNumOfChapters());
    }

    @org.junit.jupiter.api.Test
    void getNumOfVolumes() {
        assertEquals(first.getNumOfVolumes(), second.getNumOfVolumes());
    }

    @org.junit.jupiter.api.Test
    void setNumOfVolumes() {
        int newNumOfVol = 123;
        first.setNumOfVolumes(newNumOfVol);
        assertEquals(first.getNumOfVolumes(), newNumOfVol);
    }

    @org.junit.jupiter.api.Test
    void getStatus() {
        assertEquals(first.getStatus(), second.getStatus());
    }

    @org.junit.jupiter.api.Test
    void setStatus() {
        MangaEntry.Status newStatus = MangaEntry.Status.cancelled;
        first.setStatus(newStatus);
        assertEquals(first.getStatus(), newStatus);
    }

    @org.junit.jupiter.api.Test
    void getStartPublication() {
        assertEquals(first.getStartPublication(), second.getStartPublication());
    }

    @org.junit.jupiter.api.Test
    void setStartPublication() {
        Calendar newStart = Calendar.getInstance();
        newStart.set(Calendar.YEAR, 2023);
        newStart.set(Calendar.MONTH, Calendar.NOVEMBER);
        newStart.set(Calendar.DAY_OF_MONTH, 10);
        Date newStartPublication = newStart.getTime();

        first.setStartPublication(newStartPublication);
        assertEquals(first.getStartPublication(), newStartPublication);

        testSetup();
        first.setStartPublication(11,10,2023);
        assertEquals(first.getStartPublication().toString(), newStartPublication.toString());
    }

    @org.junit.jupiter.api.Test
    void getEndPublication() {
        assertEquals(first.getEndPublication(), second.getEndPublication());
    }

    @org.junit.jupiter.api.Test
    void setEndPublication() {
        Calendar newEnd = Calendar.getInstance();
        newEnd.set(Calendar.YEAR, 2023);
        newEnd.set(Calendar.MONTH, Calendar.NOVEMBER);
        newEnd.set(Calendar.DAY_OF_MONTH, 10);
        Date newEndPublication = newEnd.getTime();

        first.setStartPublication(newEndPublication);
        assertEquals(first.getStartPublication(), newEndPublication);

        testSetup();
        first.setStartPublication(11,10,2023);
        assertEquals(first.getStartPublication().toString(), newEndPublication.toString());
    }

    @org.junit.jupiter.api.Test
    void getGenres() {
        assertEquals(first.getGenres(), second.getGenres());
    }

    @org.junit.jupiter.api.Test
    void setGenres() {
        HashSet<MangaEntry.Genre> newGenres = new HashSet<>();
        newGenres.add(MangaEntry.Genre.action);
        first.setGenres(newGenres);

        assertEquals(newGenres, first.getGenres());
    }

    @Test
    void equalsHelper() {

    }
}