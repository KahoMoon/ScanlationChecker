package MangaDex;

import java.util.Date;
import java.util.List;

public class MangaDexJson {
    class Data {
        class Language {
            String en;
            String ru;
            String ja;
            String ja_ro;
            String zh;
            String zh_hk;
            String zh_ro;
            String pt_br;
            String es;
            String es_la;
            String ko_ro;
        }
        class Relationship {
            String id;
            String type;
            String related;
        }
        class TagAttribute {
            Language name;
            Language description;
            String group;
            int version;
        }
        class TagRelationship {

        }
        class Attribute {
            class Links {
                String al;
                String ap;
                String bw;
                String kt;
                String mu;
                String nu;
                String amz;
                String ebj;
                String mal;
                String cdj;
                String raw;
                String engtl;
            }
            class Tags {
                String id;
                String type;
                TagAttribute attributes;
                List<TagRelationship> relationships;
            }
            Language title;
            List<Language> altTitles;
            Language description;
            boolean isLocked;
            Links links;
            String originalLanguage;
            String lastVolume;
            String lastChapter;
            String publicationDemographic;
            String status;
            int year;
            String contentRating;
            Tags tags;
            String state;
            boolean chapterNumbersResetOnNewVolume;
            String createdAt;
            String updatedAt;
            int version;
            List<String> availableTranslatedLanguages;
            String latestUploadedChapter;
        }
        String id;
        String type;
        Attribute attributes;
        List<Relationship> relationships;
    }

    String result;
    String response;
    List<Data> data;
    int limit;
    int offset;
    int total;

}

