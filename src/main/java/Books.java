import java.util.Objects;

public class Books extends Library {

    private String Code;
    private String Series;
    private String Name;
    private String date;


    public Books(String code) {
        Code = code;
    }


    public Books(String code, String series, String name, String date) {
        Code = code;
        Series = series;
        Name = name;
        this.date = date;

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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString(){
        return "code: " + getCode() +  " Series: " + getSeries() + " Name: " + getName() + " Date: " + getDate();
    }


}
