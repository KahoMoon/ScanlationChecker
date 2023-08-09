package MangaDex.Data.Attribute;

import MangaDex.Data.Attribute.Tag.Tag;

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
}
