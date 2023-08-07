package MangaDex;

import java.util.Date;
import java.util.List;

public class MangaDexJson {
    public class Data {
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

            public String getEn() {
                return en;
            }

            public void setEn(String en) {
                this.en = en;
            }

            public String getRu() {
                return ru;
            }

            public void setRu(String ru) {
                this.ru = ru;
            }

            public String getJa() {
                return ja;
            }

            public void setJa(String ja) {
                this.ja = ja;
            }

            public String getJa_ro() {
                return ja_ro;
            }

            public void setJa_ro(String ja_ro) {
                this.ja_ro = ja_ro;
            }

            public String getZh() {
                return zh;
            }

            public void setZh(String zh) {
                this.zh = zh;
            }

            public String getZh_hk() {
                return zh_hk;
            }

            public void setZh_hk(String zh_hk) {
                this.zh_hk = zh_hk;
            }

            public String getZh_ro() {
                return zh_ro;
            }

            public void setZh_ro(String zh_ro) {
                this.zh_ro = zh_ro;
            }

            public String getPt_br() {
                return pt_br;
            }

            public void setPt_br(String pt_br) {
                this.pt_br = pt_br;
            }

            public String getEs() {
                return es;
            }

            public void setEs(String es) {
                this.es = es;
            }

            public String getEs_la() {
                return es_la;
            }

            public void setEs_la(String es_la) {
                this.es_la = es_la;
            }

            public String getKo_ro() {
                return ko_ro;
            }

            public void setKo_ro(String ko_ro) {
                this.ko_ro = ko_ro;
            }
        }
        class Relationship {
            String id;
            String type;
            String related;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRelated() {
                return related;
            }

            public void setRelated(String related) {
                this.related = related;
            }
        }
        class TagAttribute {
            Language name;
            Language description;
            String group;
            int version;

            public Language getName() {
                return name;
            }

            public void setName(Language name) {
                this.name = name;
            }

            public Language getDescription() {
                return description;
            }

            public void setDescription(Language description) {
                this.description = description;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }
        }
        class TagRelationship {

        }
        public class Attribute {
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

                public String getAl() {
                    return al;
                }

                public void setAl(String al) {
                    this.al = al;
                }

                public String getAp() {
                    return ap;
                }

                public void setAp(String ap) {
                    this.ap = ap;
                }

                public String getBw() {
                    return bw;
                }

                public void setBw(String bw) {
                    this.bw = bw;
                }

                public String getKt() {
                    return kt;
                }

                public void setKt(String kt) {
                    this.kt = kt;
                }

                public String getMu() {
                    return mu;
                }

                public void setMu(String mu) {
                    this.mu = mu;
                }

                public String getNu() {
                    return nu;
                }

                public void setNu(String nu) {
                    this.nu = nu;
                }

                public String getAmz() {
                    return amz;
                }

                public void setAmz(String amz) {
                    this.amz = amz;
                }

                public String getEbj() {
                    return ebj;
                }

                public void setEbj(String ebj) {
                    this.ebj = ebj;
                }

                public String getMal() {
                    return mal;
                }

                public void setMal(String mal) {
                    this.mal = mal;
                }

                public String getCdj() {
                    return cdj;
                }

                public void setCdj(String cdj) {
                    this.cdj = cdj;
                }

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getEngtl() {
                    return engtl;
                }

                public void setEngtl(String engtl) {
                    this.engtl = engtl;
                }
            }
            class Tags {
                String id;
                String type;
                TagAttribute attributes;
                List<TagRelationship> relationships;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public TagAttribute getAttributes() {
                    return attributes;
                }

                public void setAttributes(TagAttribute attributes) {
                    this.attributes = attributes;
                }

                public List<TagRelationship> getRelationships() {
                    return relationships;
                }

                public void setRelationships(List<TagRelationship> relationships) {
                    this.relationships = relationships;
                }
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

            public Language getTitle() {
                return title;
            }

            public void setTitle(Language title) {
                this.title = title;
            }

            public List<Language> getAltTitles() {
                return altTitles;
            }

            public void setAltTitles(List<Language> altTitles) {
                this.altTitles = altTitles;
            }

            public Language getDescription() {
                return description;
            }

            public void setDescription(Language description) {
                this.description = description;
            }

            public boolean isLocked() {
                return isLocked;
            }

            public void setLocked(boolean locked) {
                isLocked = locked;
            }

            public Links getLinks() {
                return links;
            }

            public void setLinks(Links links) {
                this.links = links;
            }

            public String getOriginalLanguage() {
                return originalLanguage;
            }

            public void setOriginalLanguage(String originalLanguage) {
                this.originalLanguage = originalLanguage;
            }

            public String getLastVolume() {
                return lastVolume;
            }

            public void setLastVolume(String lastVolume) {
                this.lastVolume = lastVolume;
            }

            public String getLastChapter() {
                return lastChapter;
            }

            public void setLastChapter(String lastChapter) {
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

            public Tags getTags() {
                return tags;
            }

            public void setTags(Tags tags) {
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

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public List<String> getAvailableTranslatedLanguages() {
                return availableTranslatedLanguages;
            }

            public void setAvailableTranslatedLanguages(List<String> availableTranslatedLanguages) {
                this.availableTranslatedLanguages = availableTranslatedLanguages;
            }

            public String getLatestUploadedChapter() {
                return latestUploadedChapter;
            }

            public void setLatestUploadedChapter(String latestUploadedChapter) {
                this.latestUploadedChapter = latestUploadedChapter;
            }
        }
        String id;
        String type;
        Attribute attributes;
        List<Relationship> relationships;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Attribute getAttributes() {
            return attributes;
        }

        public void setAttributes(Attribute attributes) {
            this.attributes = attributes;
        }

        public List<Relationship> getRelationships() {
            return relationships;
        }

        public void setRelationships(List<Relationship> relationships) {
            this.relationships = relationships;
        }
    }

    String result;
    String response;
    List<Data> data;
    int limit;
    int offset;
    int total;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

