package xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class BookJAXB {

    private String name;
    private String originalName;
    private String series;
    private int year;
    private String translator;
    private int pages;
    private String isImg;
    private double price;

    public BookJAXB() {
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @XmlElement
    public void setSeries(String series) {
        this.series = series;
    }

    @XmlElement
    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    @XmlElement
    public void setPages(int pages) {
        this.pages = pages;
    }

    @XmlElement
    public void setIsImg(String isImg) {
        this.isImg = isImg;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "xml.BookJAXB{" +
                ", name='" + name + '\'' +
                ", originalName='" + originalName + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                ", translator='" + translator + '\'' +
                ", pages=" + pages +
                ", isImg='" + isImg + '\'' +
                ", price=" + price +
                '}';
    }
}
