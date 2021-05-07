package domain;

import java.util.Date;



public class Album {

    protected int idAlbum;
    public static int counterAlbum;

    protected String name;
    protected String type;
    protected Date releaseDate;
    protected int catalogId;
    protected String label;
    protected String format;


    public Album() {


    }

    public Album(String name, String type, Date releaseDate, int catalogId, String label, String format) {
        this.idAlbum = ++Album.counterAlbum;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.catalogId = catalogId;
        this.label = label;
        this.format = format;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Album setType(String type) {
        this.type = type;
        return this;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Album setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public Album setCatalogId(int catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Album setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public Album setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Album{");
        sb.append("idAlbum=").append(idAlbum);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", catalogId=").append(catalogId);
        sb.append(", label='").append(label).append('\'');
        sb.append(", format='").append(format).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
