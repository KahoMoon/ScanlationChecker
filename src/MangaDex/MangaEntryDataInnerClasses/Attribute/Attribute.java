package MangaDex.MangaEntryDataInnerClasses.Attribute;

import MangaDex.MangaEntryDataInnerClasses.Attribute.Tag.Tag;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

public class Attribute {
    String title;
    HashSet<String> altTitles;
    HashMap<String, String> description;
    boolean isLocked;
    HashMap<String, String> links;
    String originalLanguage;
    int lastVolume;
    int lastChapter;
    String publicationDemographic;
    String status;
    int year;
    String contentRating;
    HashSet<Tag> tags;
    String state;
    boolean chapterNumbersResetOnNewVolume;
    Calendar createdAt;
    Calendar updatedAt;
    int version;
    String latestUploadedChapter;

    public Attribute(String title, HashSet<String> altTitles, HashMap<String, String> description, boolean isLocked, HashMap<String, String> links, String originalLanguage, int lastVolume, int lastChapter, String publicationDemographic, String status, int year, String contentRating, HashSet<Tag> tags, String state, boolean chapterNumbersResetOnNewVolume, Calendar createdAt, Calendar updatedAt, int version, String latestUploadedChapter) {
        this.title = title;
        this.altTitles = altTitles;
        this.description = description;
        this.isLocked = isLocked;
        this.links = links;
        this.originalLanguage = originalLanguage;
        this.lastVolume = lastVolume;
        this.lastChapter = lastChapter;
        this.publicationDemographic = publicationDemographic;
        this.status = status;
        this.year = year;
        this.contentRating = contentRating;
        this.tags = tags;
        this.state = state;
        this.chapterNumbersResetOnNewVolume = chapterNumbersResetOnNewVolume;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = version;
        this.latestUploadedChapter = latestUploadedChapter;
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

    public HashMap<String, String> getDescription() {
        return description;
    }

    public void setDescription(HashMap<String, String> description) {
        this.description = description;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public HashMap<String, String> getLinks() {
        return links;
    }

    public void setLinks(HashMap<String, String> links) {
        this.links = links;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public int getLastVolume() {
        return lastVolume;
    }

    public void setLastVolume(int lastVolume) {
        this.lastVolume = lastVolume;
    }

    public int getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(int lastChapter) {
        this.lastChapter = lastChapter;
    }

    public String getPublicationDemographic() {
        return publicationDemographic;
    }

    public void setPublicationDemographic(String publicationDemographic) {
        this.publicationDemographic = publicationDemographic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public HashSet<Tag> getTags() {
        return tags;
    }

    public void setTags(HashSet<Tag> tags) {
        this.tags = tags;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChapterNumbersResetOnNewVolume() {
        return chapterNumbersResetOnNewVolume;
    }

    public void setChapterNumbersResetOnNewVolume(boolean chapterNumbersResetOnNewVolume) {
        this.chapterNumbersResetOnNewVolume = chapterNumbersResetOnNewVolume;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getLatestUploadedChapter() {
        return latestUploadedChapter;
    }

    public void setLatestUploadedChapter(String latestUploadedChapter) {
        this.latestUploadedChapter = latestUploadedChapter;
    }
}
