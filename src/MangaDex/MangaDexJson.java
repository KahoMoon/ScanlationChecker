package MangaDex;

import java.util.Date;
import java.util.List;

public class MangaDexJson {

    String result;
    String response;

    class Data {
        String id;
        String type;

        class Attribute {
            String title;
            List<String> altTitles;
            List<String> description;
            boolean isLocked;
            List<String> links;
            String originalLanguage;
            String lastVolume;
            String lastChapter;
            String publicationDemographic;
            String status;
            int year;
            String contentRating;

            class Tags {

            }
            Tags tags;

            String state;
            boolean chapterNumbersResetOnNewVolume;
            Date createdAt;
            Date updatedAt;
            int version;
            List<String> availableTranslatedLanguages;
            String latestUploadedChapter;
        }
        Attribute attribute;

        class Relationships {
            String id;
            String author;
            String related;
        }
        Relationships relationships;
    }
    List<Data> data;
    int limit;
    int offset;
    int total;

}
