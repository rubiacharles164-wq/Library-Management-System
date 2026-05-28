public class Books {

    private String Series;
    private String Name;
    private String date;
    private Integer Copies;

    public Books() {
    }

    public Books(String series) {
        Series = series;
    }

    public Books(String series, String name, String date, Integer copies) {
        Series = series;
        Name = name;
        this.date = date;
        Copies = copies;
    }

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCopies() {
        return Copies;
    }

    public void setCopies(Integer copies) {
        Copies = copies;
    }
}
