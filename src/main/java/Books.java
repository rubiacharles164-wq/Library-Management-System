import java.util.Objects;

public class Books extends Library {

    private String Code;
    private String Series;
    private String Name;
    private String date;
    private Integer Copies;

    public Books(String code) {
        Code = code;
    }


    public Books(String code, String series, String name, String date, Integer copies) {
        Code = code;
        Series = series;
        Name = name;
        this.date = date;
        Copies = copies;
    }

    public Books() {

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


    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }




}
