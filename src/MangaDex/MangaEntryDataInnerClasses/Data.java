package MangaDex.MangaEntryDataInnerClasses;

import MangaDex.MangaEntryDataInnerClasses.Attribute.Attribute;

public class Data {
    String id;
    String type;
    Attribute attributes;
    Relationship relationships;

    public Data(String id, String type, Attribute attributes, Relationship relationships) {
        this.id = id;
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }

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

    public Relationship getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationship relationships) {
        this.relationships = relationships;
    }
}
